package pk.waseem.BlogApp.network

import pk.waseem.BlogApp.contract.Request
import pk.waseem.BlogApp.contract.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface IRequestContract {
    @POST("service.php")
    fun makeApiCall(@Body request: Request):Call<Response>
}