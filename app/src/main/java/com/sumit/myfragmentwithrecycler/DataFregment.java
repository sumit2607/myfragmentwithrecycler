package com.sumit.myfragmentwithrecycler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataFregment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataFregment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<DataModel> dataHolder;
    public DataFregment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataFregment.
     */
    // TODO: Rename and change types and number of parameters
    public static DataFregment newInstance(String param1, String param2) {
        DataFregment fragment = new DataFregment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view  =  inflater.inflate(R.layout.fragment_data_fregment, container, false);
    recyclerView = view.findViewById(R.id.recview);
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    dataHolder = new ArrayList<>();
    DataModel ob1 = new DataModel(R.drawable.cute2 , "racoon", "AnimalOne");
    dataHolder.add (ob1);

        DataModel ob2 = new DataModel(R.drawable.cute2 , "racoon", "AnimalOne");
        dataHolder.add (ob2);

        DataModel ob3 = new DataModel(R.drawable.owl , "racoon", "AnimalOne");
        dataHolder.add (ob3);

        DataModel ob4 = new DataModel(R.drawable.pigeon , "racoon", "AnimalOne");
        dataHolder.add (ob4);

        DataModel ob5 = new DataModel(R.drawable.racoon , "racoon", "AnimalOne");
        dataHolder.add (ob5);

        DataModel ob6 = new DataModel(R.drawable.cute2 , "racoon", "AnimalOne");
        dataHolder.add (ob6);

        DataModel ob8 = new DataModel(R.drawable.owl , "racoon", "AnimalOne");
        dataHolder.add (ob3);

        DataModel ob10 = new DataModel(R.drawable.pigeon , "racoon", "AnimalOne");
        dataHolder.add (ob4);

        DataModel ob11 = new DataModel(R.drawable.racoon , "racoon", "AnimalOne");
        dataHolder.add (ob5);

        DataModel ob45 = new DataModel(R.drawable.cute2 , "racoon", "AnimalOne");
        dataHolder.add (ob6);

        recyclerView.setAdapter(new myAdapter(dataHolder));


    return  view;
    }

}