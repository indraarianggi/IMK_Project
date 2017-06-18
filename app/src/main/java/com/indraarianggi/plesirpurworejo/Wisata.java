package com.indraarianggi.plesirpurworejo;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by indraarianggi on 06/06/2017.
 */

//public class Wisata extends BaseActivity {
//
//    //deklarasi variabel reyclerview
//    RecyclerView rv;
//    CardView cv;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.layout_list);
//
//        rv = (RecyclerView)findViewById(R.id.recycler_view);
//
//        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, getData());
//        rv.setHasFixedSize(true);
//        rv.setAdapter(recyclerAdapter);
//        rv.setLayoutManager(new LinearLayoutManager(this));
//    }
//
//    public List<ParsingClass> getData() {
//
//        Integer[] image = {
//                R.drawable.wisata_curug_condong,
//                R.drawable.wisata_curug_abang,
//                R.drawable.wisata_curug_lesung,
//                R.drawable.wisata_curug_muncar,
//                R.drawable.wisata_curug_purbayan,
//                R.drawable.wisata_curug_sikantong,
//                R.drawable.wisata_curug_tawing,
//                R.drawable.wisata_hutan_pinus,
//                R.drawable.wisata_pantai_jatimalang,
//                R.drawable.wisata_pantai_ketawang,
//                R.drawable.wisata_pantai_puncu,
//                R.drawable.wisata_benteng_pendem,
//                R.drawable.wisata_geger_menjangan,
//                R.drawable.wisata_curug_silangit,
//                R.drawable.wisata_masjid_agung,
//                R.drawable.wisata_gua_seplawan,
//                R.drawable.wisata_museum_tosan_aji,
//                R.drawable.wisata_alun_alun
//        };
//
//        List<String> caption = Arrays.asList(getResources().getStringArray(R.array.nama_wisata));
//
//        List<String> detail = Arrays.asList(getResources().getStringArray(R.array.deskripsi_wisata));
//
//        ArrayList<ParsingClass> data = new ArrayList<ParsingClass>();
//
//        for (int i = 0; i < image.length; i++) {
//            ParsingClass parsingClass = new ParsingClass();
//
////            parsingClass.image = icon[i];
////            parsingClass.caption = caption.get(i);
////            data.add(parsingClass);
//
//            parsingClass.setImage(image[i]);
//            parsingClass.setCaption(caption.get(i));
//            parsingClass.setDetail(detail.get(i));
//            data.add(parsingClass);
//        }
//
//        return data;
//    }
//}


public class Wisata extends BaseActivity {

    //deklarasi variabel reyclerview
    private RecyclerView rv;
    private CardView cv;

    private ArrayList<ParsingClass> data;

    private RecyclerView.Adapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list);

        rv = (RecyclerView) findViewById(R.id.recycler_view);

        Integer[] image = {
                R.drawable.wisata_curug_condong,
                R.drawable.wisata_curug_abang,
                R.drawable.wisata_curug_lesung,
                R.drawable.wisata_curug_muncar,
                R.drawable.wisata_curug_purbayan,
                R.drawable.wisata_curug_sikantong,
                R.drawable.wisata_curug_tawing,
                R.drawable.wisata_hutan_pinus,
                R.drawable.wisata_pantai_jatimalang,
                R.drawable.wisata_pantai_ketawang,
                R.drawable.wisata_pantai_puncu,
                R.drawable.wisata_benteng_pendem,
                R.drawable.wisata_geger_menjangan,
                R.drawable.wisata_curug_silangit,
                R.drawable.wisata_masjid_agung,
                R.drawable.wisata_gua_seplawan,
                R.drawable.wisata_museum_tosan_aji,
                R.drawable.wisata_alun_alun
        };

        List<String> caption = Arrays.asList(getResources().getStringArray(R.array.nama_wisata));

        List<String> detail = Arrays.asList(getResources().getStringArray(R.array.deskripsi_wisata));

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
