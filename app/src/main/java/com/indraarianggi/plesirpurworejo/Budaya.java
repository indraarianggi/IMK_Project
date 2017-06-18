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

public class Budaya extends BaseActivity {

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
                R.drawable.seni_cepetan,
                R.drawable.seni_cing_poo_ling,
                R.drawable.seni_tari_dolalak,
                R.drawable.seni_icling,
                R.drawable.seni_soyar_maole,
                R.drawable.seni_jolenan,
                R.drawable.seni_petik_tirta,
                R.drawable.seni_cekok_mondhol
        };

        List<String> caption = Arrays.asList(getResources().getStringArray(R.array.nama_budaya));

        List<String> detail = Arrays.asList(getResources().getStringArray(R.array.deskripsi_budaya));

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
