package com.alexfedosenko.simplereaderforreddit

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.alexfedosenko.simplereaderforreddit.models.PostModel
import com.google.gson.Gson

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val postModel = Gson().fromJson<PostModel>("{\n" +
                "                    \"domain\": \"i.imgur.com\",\n" +
                "                    \"banned_by\": null,\n" +
                "                    \"media_embed\": {},\n" +
                "                    \"subreddit\": \"funny\",\n" +
                "                    \"selftext_html\": null,\n" +
                "                    \"selftext\": \"\",\n" +
                "                    \"likes\": null,\n" +
                "                    \"user_reports\": [],\n" +
                "                    \"secure_media\": null,\n" +
                "                    \"link_flair_text\": null,\n" +
                "                    \"id\": \"2hqlxp\",\n" +
                "                    \"gilded\": 0,\n" +
                "                    \"secure_media_embed\": {},\n" +
                "                    \"clicked\": false,\n" +
                "                    \"report_reasons\": null,\n" +
                "                    \"author\": \"washedupwornout\",\n" +
                "                    \"media\": null,\n" +
                "                    \"score\": 4841,\n" +
                "                    \"approved_by\": null,\n" +
                "                    \"over_18\": false,\n" +
                "                    \"hidden\": false,\n" +
                "                    \"thumbnail\": \"http://b.thumbs.redditmedia.com/9N1f7UGKM5fPZydrsgbb4_SUyyLW7A27um1VOygY3LM.jpg\",\n" +
                "                    \"subreddit_id\": \"t5_2qh33\",\n" +
                "                    \"edited\": false,\n" +
                "                    \"link_flair_css_class\": null,\n" +
                "                    \"author_flair_css_class\": null,\n" +
                "                    \"downs\": 0,\n" +
                "                    \"mod_reports\": [],\n" +
                "                    \"saved\": false,\n" +
                "                    \"is_self\": false,\n" +
                "                    \"name\": \"t3_2hqlxp\",\n" +
                "                    \"permalink\": \"/r/funny/comments/2hqlxp/man_trying_to_return_a_dogs_toy_gets_tricked_into/\",\n" +
                "                    \"stickied\": false,\n" +
                "                    \"created\": 1411975314,\n" +
                "                    \"url\": \"http://i.imgur.com/4CHXnj2.gif\",\n" +
                "                    \"author_flair_text\": null,\n" +
                "                    \"title\": \"Man trying to return a dog's toy gets tricked into playing fetch\",\n" +
                "                    \"created_utc\": 1411946514,\n" +
                "                    \"ups\": 4841,\n" +
                "                    \"num_comments\": 958,\n" +
                "                    \"visited\": false,\n" +
                "                    \"num_reports\": null,\n" +
                "                    \"distinguished\": null\n" +
                "                }", PostModel::class.java)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
