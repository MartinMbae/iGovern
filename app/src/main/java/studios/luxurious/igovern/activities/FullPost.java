package studios.luxurious.igovern.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import studios.luxurious.igovern.R;

public class FullPost extends AppCompatActivity {

    private TextView author, date,content,county,title,type,status;
    String authorString, dateString, contentString, countyString, titleString, typeString, statusString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_post);

        authorString = getIntent().getStringExtra("author");
        dateString = getIntent().getStringExtra("date");
        contentString = getIntent().getStringExtra("content");
        contentString = getIntent().getStringExtra("county");
        contentString = getIntent().getStringExtra("title");
        contentString = getIntent().getStringExtra("type");
        contentString = getIntent().getStringExtra("status");


        author = findViewById(R.id.author);
        date = findViewById(R.id.date);
        content = findViewById(R.id.content);


        author.setText(authorString);
        date.setText(dateString);
        content.setText(contentString);


    }
}
