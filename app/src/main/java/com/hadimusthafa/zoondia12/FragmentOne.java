package com.hadimusthafa.zoondia12;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class FragmentOne extends Fragment {

    private FileAdapter FileAdapter;
    private RecyclerView recyclerView;
    public View view;
    Context mContext;

    public FragmentOne() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentone, container, false);

        recyclerView = view.findViewById(R.id.recycler);
//        fetchFiles();
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    public void fetchFiles() throws JSONException {

        String abn = "[\n" +
                "  {\n" +
                "    \"OrderNo\": 1,\n" +
                "    \"name\": \"Under the Dome\",\n" +
                "    \"mob\": \"Scripted\",\n" +
                "    \"location\": \"English\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"OrderNo\": 1,\n" +
                "    \"name\": \"Under the Dome\",\n" +
                "    \"mob\": \"Scripted\",\n" +
                "    \"location\": \"English\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"OrderNo\": 1,\n" +
                "    \"name\": \"Under the Dome\",\n" +
                "    \"mob\": \"Scripted\",\n" +
                "    \"location\": \"English\"\n" +
                "  }\n" +
                "]";

        JSONArray jsonArray = new JSONArray(abn);

/*
        try {

            Log.e("response-->", "----Hadi----->"+jsonArray);

            ArrayList<FileModel> modelRecyclerArrayList = new ArrayList<>();

            for (int i=0;i<jsonArray.length();i++){

                FileModel modelRecycler = new FileModel();
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                modelRecycler.setName(jsonObject.getString("name"));
                modelRecyclerArrayList.add(modelRecycler);
            }
            if (modelRecyclerArrayList.size()>0){
                FileAdapter = new MyAdapter(getApplicationContext() , modelRecyclerArrayList);
                recyclerView.setAdapter(myAdapter);
                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
            }else {
                recyclerView.setVisibility(View.GONE);
            }

        }catch (Exception e){
            Log.e("ee-->",e.toString());
        }
*/

    }
}