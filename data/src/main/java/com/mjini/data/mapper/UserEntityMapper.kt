package com.mjini.data.mapper

import com.mjini.data.entity.UserEntity
import com.mjini.domain.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserEntityMapper @Inject constructor() {
    fun transform(data: UserEntity): User = with(data) {
        return User(
            login,
            id,
            node_id,
            avatar_url,
            gravatar_id,
            url,
            html_url,
            followers_url,
            following_url,
            gists_url,
            starred_url,
            subscriptions_url,
            organizations_url,
            repos_url,
            events_url,
            received_events_url,
            type,
            site_admin,
            name,
            company,
            blog,
            location,
            email,
            hireable,
            bio,
            twitter_username,
            public_repos,
            public_gists,
            followers,
            following,
            created_at,
            updated_at,
        )
    }
}