package com.pwc.bank.response;

import com.pwc.bank.entity.Users;

public class userResponse
{
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String setMessage(String str)
    {
        return "str";
    }
}
