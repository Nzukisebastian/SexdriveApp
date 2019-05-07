package com.example.sexdriveapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserClient {
    //createAccount(User user);
    @POST("mpesa.php")
    Call<User>createAccount(@Body User user);
}
