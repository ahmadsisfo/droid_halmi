package com.sisfo.halmi.fragmen;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sisfo.halmi.R;
import com.sisfo.halmi.adapter.AlbumsAdapter;
import com.sisfo.halmi.adapter.HomemenuAdapter;
import com.sisfo.halmi.model.Album;
import com.sisfo.halmi.model.Homemenu;

import java.util.ArrayList;
import java.util.List;


public class EvaluasiFragmen extends Fragment {

    private RecyclerView recyclerView;
    private HomemenuAdapter adapter;
    private List<Homemenu> albumList;
    View view;


    public EvaluasiFragmen() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragmen_evaluasi, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new HomemenuAdapter(getContext(), albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        return view;

    }


    private void prepareAlbums() {
        int[] covers = new int[]{
            R.drawable.hormon,
            R.drawable.indra,
            R.drawable.saraf,
        };

        Homemenu a = new Homemenu("Soal Hormon", 0, covers[0], "hormon");
        albumList.add(a);

        a = new Homemenu("Soal Indra", 1, covers[1], "indra");
        albumList.add(a);

        a = new Homemenu("Soal Saraf", 2, covers[2],"saraf");
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

}

