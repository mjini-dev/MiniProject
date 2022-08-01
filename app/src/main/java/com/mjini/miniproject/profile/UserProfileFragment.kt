package com.mjini.miniproject.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mjini.baseproject.databinding.UserProfileFragmentBinding
import com.mjini.miniproject.base.BindingFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserProfileFragment :  BindingFragment<UserProfileFragmentBinding, UserProfileViewModel>() {

    companion object {
        fun newInstance() = UserProfileFragment()
    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> UserProfileFragmentBinding
        get() = UserProfileFragmentBinding::inflate

    private val userName by lazy {
        UserProfileFragmentArgs.fromBundle(requireArguments()).userName
    }

    override fun initView() {
        binding.apply {
            viewmodel.getUserByCoroutine(userName)

        }

    }

    override fun observeData() {

    }

}