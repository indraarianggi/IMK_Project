package com.indraarianggi.plesirpurworejo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by indraarianggi on 06/06/2017.
 */

//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder>  {
//
//    LayoutInflater li;
//    List<ParsingClass> data = Collections.emptyList();
//
//    public RecyclerAdapter(Context context, List<ParsingClass> myData) {
//        li = LayoutInflater.from(context);
//        data = myData;
//    }
//
//    @Override
//    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = li.inflate(R.layout.card_layout, parent, false);
//        MyHolder myHolder = new MyHolder(v);
//        return myHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(MyHolder myHolder, int position) {
//        ParsingClass p = data.get(position);
//
////        myHolder.image.setImageResource(p.image);
////        myHolder.caption.setText(p.caption);
//
//        myHolder.image.setImageResource(p.getImage());
//        myHolder.caption.setText(p.getCaption());
//        myHolder.pc = p;
//    }
//
//    @Override
//    public int getItemCount() {
//        return data.size();
//    }
//
//    class MyHolder extends RecyclerView.ViewHolder {
//        ImageView image;
//        TextView caption;
//
//        public ParsingClass pc;
//
//        public MyHolder(View itemView) {
//            super(itemView);
//            image = (ImageView) itemView.findViewById(R.id.icon);
//            caption = (TextView) itemView.findViewById(R.id.caption);
//
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(v.getContext(), DetailActivity.class);
//
//                    String acaption = pc.getCaption();
//                    String adetail = pc.getDetail();
//                    Integer aimage = pc.getImage();
//
//                    intent.putExtra("caption", acaption);
//                    intent.putExtra("image", aimage);
//                    intent.putExtra("detail", adetail);
//
//                    v.getContext().startActivity(intent);
//                }
//            });
//        }
//    }
//}








public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder>  {

    private static ArrayList<ParsingClass> dataSet;

    public RecyclerAdapter(ArrayList<ParsingClass> myData) {
        dataSet = myData;
    }

    @Override
    public RecyclerAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);

        MyHolder myHolder = new MyHolder(itemView);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int position) {
        ParsingClass p = dataSet.get(position);

        myHolder.image.setImageResource(p.getImage());
        myHolder.caption.setText(p.getCaption());
        myHolder.pc = p;
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView caption;

        public ParsingClass pc;

        public MyHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.icon);
            caption = (TextView) itemView.findViewById(R.id.caption);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), DetailActivity.class);

                    String acaption = pc.getCaption();
                    String adetail = pc.getDetail();
                    Integer aimage = pc.getImage();

                    intent.putExtra("caption", acaption);
                    intent.putExtra("image", aimage);
                    intent.putExtra("detail", adetail);

                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
