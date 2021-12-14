package rob.myappcompany.fragmentwithrecyclerviewdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class NewFragment extends Fragment {

    RecyclerView recyclerview;
    List<Model> itemList;

    public NewFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);

        recyclerview = view.findViewById(R.id.recycler);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));

        //initData();

        recyclerview.setAdapter(new itemAdapter(initData()));
        return view;
    }

    private List<Model> initData() {
        itemList = new ArrayList<>();
        itemList.add(new Model(R.drawable.img1, "Video 1"));
        itemList.add(new Model(R.drawable.img2, "Video 2"));
        itemList.add(new Model(R.drawable.img3, "Video 3"));
        itemList.add(new Model(R.drawable.img4, "Video 4"));
        itemList.add(new Model(R.drawable.img5, "Video 5"));

        return itemList;
    }
}