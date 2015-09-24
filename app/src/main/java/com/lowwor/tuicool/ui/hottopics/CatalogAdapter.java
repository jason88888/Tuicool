package com.lowwor.tuicool.ui.hottopics;

/**
 * Created by lowworker on 2015/9/20.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lowwor.tuicool.R;
import com.lowwor.tuicool.model.HotTopicsCatalog;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.ViewHolder> {
    Context mContext;
    List<HotTopicsCatalog> mCatalogs = new ArrayList<>();

    public CatalogAdapter(List<HotTopicsCatalog> catalogs, Context context) {
        this.mCatalogs = catalogs;
        mContext = context;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_catalog, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        HotTopicsCatalog catalog = mCatalogs.get(i);
        viewHolder.mCatalogWrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        viewHolder.tvCatalog.setText(catalog.name);


    }

    @Override
    public int getItemCount() {
        return mCatalogs.size();
    }


    public void initialize(List<HotTopicsCatalog> data) {

        mCatalogs = data;
        notifyDataSetChanged();

    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.tv_catalog)
        TextView tvCatalog;
        @Bind(R.id.catalog_wrapper)
        LinearLayout mCatalogWrapper;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }
}
