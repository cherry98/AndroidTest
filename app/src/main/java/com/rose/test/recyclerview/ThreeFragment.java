package com.rose.test.recyclerview;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rose.test.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeFragment extends Fragment {


    public ThreeFragment() {
        // Required empty public constructor
    }

    private RecyclerView recycler_view;
    private List<String> list = new ArrayList<>();
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_three, container, false);
        init(inflate);
        return inflate;
    }

    private void init(View inflate) {
        recycler_view = inflate.findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(getContext()));
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试5");
        list.add("测试");
        list.add("测试");
        list.add("测试4444");
        list.add("测试");
        list.add("测试6");
        list.add("测试");
        list.add("测试");
        list.add("测试");
        list.add("测试6");
        list.add("测试");
        list.add("测试");
        list.add("测试222");
        list.add("测试");
        list.add("测试9");
        recyclerViewAdapter = new RecyclerViewAdapter(getContext(), list);
        recycler_view.setAdapter(recyclerViewAdapter);
    }

}
