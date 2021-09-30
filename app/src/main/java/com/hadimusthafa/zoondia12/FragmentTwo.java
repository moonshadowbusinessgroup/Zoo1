package com.hadimusthafa.zoondia12;

import android.content.Context;
import android.os.Bundle;
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

public class FragmentTwo extends Fragment {

    private FileAdapter FileAdapter;
    private RecyclerView recyclerView;
    public View view;
    Context mContext;
    JSONArray jsonArray;
    String sss;

    public FragmentTwo() {
    }

    public FragmentTwo(JSONArray JSONaa) {
        jsonArray = JSONaa;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenttwo, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        fetchFiles();

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    public void fetchFiles() {

        ArrayList<FileModel> fileModelArrayList = new ArrayList<>();
        try {
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                FileModel FileModel = new FileModel();
                String Url = jsonObject.getString("Url");
                sss = jsonArray.toString();
         /*       FileModel.setUrl(jsonObject.getString("Url"));
                FileModel.setName(jsonObject.getString("Name"));
                FileModel.setFile("image");*/
                fileModelArrayList.add(FileModel);

            }
            FileAdapter = new FileAdapter(mContext.getApplicationContext(), fileModelArrayList, sss);
            recyclerView.setAdapter(FileAdapter);
            recyclerView.setLayoutManager(new GridLayoutManager(mContext.getApplicationContext(), 3));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}