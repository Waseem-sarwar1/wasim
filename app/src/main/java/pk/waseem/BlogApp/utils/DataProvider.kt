package pk.waseem.BlogApp.utils
import pk.waseem.BlogApp.contract.Blog
import pk.waseem.BlogApp.contract.Response

object DataProvider {
    var response:Response = Response()
    var blog: Blog = Blog()
    lateinit var userId:String
    lateinit var userName:String
}