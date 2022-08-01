package com.mjini.miniproject.main

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mjini.baseproject.databinding.InputUserNameFragmentBinding
import com.mjini.miniproject.base.BindingFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InputUserNameFragment :
    BindingFragment<InputUserNameFragmentBinding, InputUserNameViewModel>() {

    companion object {
        fun newInstance() = InputUserNameFragment()
    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> InputUserNameFragmentBinding
        get() = InputUserNameFragmentBinding::inflate


    override fun initView() {
        binding.apply {
            btnNextOk.setOnClickListener {
                val username = etUserName.text.toString()
                if (username.isNotEmpty()) {
                    InputUserNameFragmentDirections.actionInpuUserNameFragmentToUserProfileFragment(
                        username
                    ).run { navigate(this) }

                }
            }
        }

    }

    override fun observeData() {

    }
}