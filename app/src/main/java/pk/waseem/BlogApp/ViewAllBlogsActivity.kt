package pk.waseem.BlogApp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_all_blogs.*
import pk.waseem.BlogApp.adapter.AllBlogAdapter
import pk.waseem.BlogApp.contract.Blog
import pk.waseem.BlogApp.utils.DataProvider

class ViewAllBlogsActivity : AppCompatActivity() {

    lateinit var adapter:AllBlogAdapter
    lateinit var dataSource:MutableList<Blog>
    private lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_blogs)

        context = this
        dataSource = DataProvider.response.allBlogs
        adapter = AllBlogAdapter(context,dataSource)
        rvAllBlogs.adapter = adapter
    }
}
