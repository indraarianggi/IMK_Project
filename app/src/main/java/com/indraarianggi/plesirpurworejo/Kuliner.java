package com.indraarianggi.plesirpurworejo;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by indraarianggi on 06/06/2017.
 */

public class Kuliner extends BaseActivity {

    //deklarasi variabel reyclerview
    private RecyclerView rv;
    private CardView cv;

    private ArrayList<ParsingClass> data;

    private RecyclerView.Adapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list);

        rv = (RecyclerView)findViewById(R.id.recycler_view);

        Integer[] image = {
                R.drawable.kuliner_dawet_hitam,
                R.drawable.kuliner_tahu_kupat,
                R.drawable.kuliner_geblek,
                R.drawable.kuliner_clorot,
                R.drawable.kuliner_rengginang,
                R.drawable.kuliner_lanting,
                R.drawable.kuliner_kue_satu,
                R.drawable.kuliner_kue_lompong,
                R.drawable.kuliner_tiwul_punel,
                R.drawable.kuliner_krimpying,
                R.drawable.kuliner_cenil,
                R.drawable.kuliner_awug_awug,
                R.drawable.kuliner_lapis
        };

        List<String> caption = Arrays.asList(getResources().getStringArray(R.array.nama_kuliner));

        List<String> detail = Arrays.asList(getResources().getStringArray(R.array.deskripsi_kuliner));

        data = new ArrayList<ParsingClass>();

        for (int i = 0; i < image.length; i++) {
            ParsingClass parsingClass = new ParsingClass();

            parsingClass.setImage(image[i]);
            parsingClass.setCaption(caption.get(i));
            parsingClass.setDetail(detail.get(i));
            data.add(parsingClass);
        }

        rv.setHasFixedSize(true);

        rv.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(data);

        rv.setAdapter(recyclerAdapter);
    }
}
