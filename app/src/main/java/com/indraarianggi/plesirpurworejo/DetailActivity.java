package com.indraarianggi.plesirpurworejo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends BaseActivity {

    TextView caption, detail;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        caption = (TextView) findViewById(R.id.caption);
        detail = (TextView) findViewById(R.id.detail);
        image = (ImageView) findViewById(R.id.image);

        String acaption = getIntent().getExtras().getString("caption");
        Integer aimage = getIntent().getExtras().getInt("image");
        String adetail = getIntent().getExtras().getString("detail");

        caption.setText(acaption);
        image.setImageResource(aimage);
        detail.setText(adetail);
    }
}
