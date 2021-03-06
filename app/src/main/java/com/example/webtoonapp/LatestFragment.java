package com.example.webtoonapp;

import android.graphics.Rect;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LatestFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    ArrayList<WeeklyWebtoonData> latestWebtoons;
    WeeklyWebtoonData weeklyWebtoonData;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LatestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latest, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_latest);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(requireActivity(), 3);
        recyclerView.setLayoutManager(layoutManager);
        setData();

        adapter = new WeeklyRecyclerViewAdapter(latestWebtoons, requireActivity());
        recyclerView.setAdapter(adapter);


    }

    private void setData() {
        latestWebtoons = new ArrayList<>();

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10608_1620036312.6485.jpg");
        weeklyWebtoonData.setTitle("???????????? ???????????? ??????");
        weeklyWebtoonData.setSubTitle("???345???");
        weeklyWebtoonData.setHit("44???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10850_1646644683.0066.jpg");
        weeklyWebtoonData.setTitle("?????? ????????? ???????????? ????????????");
        weeklyWebtoonData.setSubTitle("???32???");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10242_1552874447.8449.jpg");
        weeklyWebtoonData.setTitle("?????????");
        weeklyWebtoonData.setSubTitle("???595???");
        weeklyWebtoonData.setHit("13???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10858_1646894514.7846.jpg");
        weeklyWebtoonData.setTitle("??? ????????? ??????");
        weeklyWebtoonData.setSubTitle("???45??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10870_1648555205.3122.jpg");
        weeklyWebtoonData.setTitle("????????????");
        weeklyWebtoonData.setSubTitle("???52???");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10663_1625193390.61.jpg");
        weeklyWebtoonData.setTitle("????????? ????????????");
        weeklyWebtoonData.setSubTitle("???200???");
        weeklyWebtoonData.setHit("48???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10229_1551329307.5441.jpg");
        weeklyWebtoonData.setTitle("?????????");
        weeklyWebtoonData.setSubTitle("???396???");
        weeklyWebtoonData.setHit("12???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10847_1646971047.4652.jpg");
        weeklyWebtoonData.setTitle("????????????");
        weeklyWebtoonData.setSubTitle("???30???");
        weeklyWebtoonData.setHit("3.0???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10333_1564369661.5709.jpg");
        weeklyWebtoonData.setTitle("????????????");
        weeklyWebtoonData.setSubTitle("???508???");
        weeklyWebtoonData.setHit("4.8???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10822_1644826219.0029.jpg");
        weeklyWebtoonData.setTitle("??????, ?????? ???????????????!");
        weeklyWebtoonData.setSubTitle("???168???");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10683_1626345727.7418.jpg");
        weeklyWebtoonData.setTitle("???????????????");
        weeklyWebtoonData.setSubTitle("???121???");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10609_1619599386.8101.jpg");
        weeklyWebtoonData.setTitle("?????????, ???????????? ????????????");
        weeklyWebtoonData.setSubTitle("???289??? ?????????");
        weeklyWebtoonData.setHit("49???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10377_1568707397.4925.jpg");
        weeklyWebtoonData.setTitle("????????? 11??????");
        weeklyWebtoonData.setSubTitle("???118??? ?????????");
        weeklyWebtoonData.setHit("102???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10829_1645411161.9839.jpg");
        weeklyWebtoonData.setTitle("???????????????");
        weeklyWebtoonData.setSubTitle("??????1 ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10825_1645175822.0559.jpg");
        weeklyWebtoonData.setTitle("????????????");
        weeklyWebtoonData.setSubTitle("???91??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10826_1645410735.9514.jpg");
        weeklyWebtoonData.setTitle("????????????");
        weeklyWebtoonData.setSubTitle("???208??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10803_1641785683.7242.jpg");
        weeklyWebtoonData.setTitle("??????????????? ??????");
        weeklyWebtoonData.setSubTitle("???60??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10665_1625220322.2119.jpg");
        weeklyWebtoonData.setTitle("???????????? ????????????");
        weeklyWebtoonData.setSubTitle("??????2 ???50??? ?????????");
        weeklyWebtoonData.setHit("1.3???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10661_1625192924.9361.jpg");
        weeklyWebtoonData.setTitle("????????? ????????? ???????????????.");
        weeklyWebtoonData.setSubTitle("???51??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8859_1525393508.0471.jpg");
        weeklyWebtoonData.setTitle("??????, ??????");
        weeklyWebtoonData.setSubTitle("???49??? ?????????");
        weeklyWebtoonData.setHit("182???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9463_1549011485.5343.jpg");
        weeklyWebtoonData.setTitle("?????? ??????, ??????!");
        weeklyWebtoonData.setSubTitle("???301??? ?????????");
        weeklyWebtoonData.setHit("66???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10541_1599189957.4978.jpg");
        weeklyWebtoonData.setTitle("????????? ????????????");
        weeklyWebtoonData.setSubTitle("???38??? ?????????");
        weeklyWebtoonData.setHit("8.3???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10682_1626345662.0359.jpg");
        weeklyWebtoonData.setTitle("?????? ?????? ????????????");
        weeklyWebtoonData.setSubTitle("??????1 ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10409_1582878801.6759.jpg");
        weeklyWebtoonData.setTitle("??? ??? ?????? ??????");
        weeklyWebtoonData.setSubTitle("???57??? ?????????");
        weeklyWebtoonData.setHit("29???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8479_1525334192.3962.jpg");
        weeklyWebtoonData.setTitle("??????????????? ???");
        weeklyWebtoonData.setSubTitle("???38??? ?????????");
        weeklyWebtoonData.setHit("15???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10681_1626345596.6749.jpg");
        weeklyWebtoonData.setTitle("?????? ?????? ????????? ??????");
        weeklyWebtoonData.setSubTitle("??????1 ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8896_1525324961.8075.jpg");
        weeklyWebtoonData.setTitle("????????? ?????????");
        weeklyWebtoonData.setSubTitle("???35??? ?????????");
        weeklyWebtoonData.setHit("18???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8995_1503372321.5861.jpg");
        weeklyWebtoonData.setTitle("?????? ???!");
        weeklyWebtoonData.setSubTitle("???68??? ?????????");
        weeklyWebtoonData.setHit("5.0???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/7438_1526621901.7552.jpg");
        weeklyWebtoonData.setTitle("????????? ?????????");
        weeklyWebtoonData.setSubTitle("???26??? ?????????");
        weeklyWebtoonData.setHit("147???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10290_1557369462.428.jpg");
        weeklyWebtoonData.setTitle("seven");
        weeklyWebtoonData.setSubTitle("??????1 ???189??? ?????????");
        weeklyWebtoonData.setHit("3.3???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/3800_1527053771.9733.jpg");
        weeklyWebtoonData.setTitle("??????:??? ??????");
        weeklyWebtoonData.setSubTitle("???44??? ?????????");
        weeklyWebtoonData.setHit("42???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10063_1525333999.2016.jpg");
        weeklyWebtoonData.setTitle("7??? ??????");
        weeklyWebtoonData.setSubTitle("???36???");
        weeklyWebtoonData.setHit("2.8???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8156_1525326427.485.jpg");
        weeklyWebtoonData.setTitle("?????????");
        weeklyWebtoonData.setSubTitle("???38??? ?????????");
        weeklyWebtoonData.setHit("16???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8972_1525393703.2779.jpg");
        weeklyWebtoonData.setTitle("??????");
        weeklyWebtoonData.setSubTitle("???30??? ?????????");
        weeklyWebtoonData.setHit("15???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10352_1566290302.4593.jpg");
        weeklyWebtoonData.setTitle("????????????");
        weeklyWebtoonData.setSubTitle("???166??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10234_1551329811.1858.jpg");
        weeklyWebtoonData.setTitle("????????? ?????????");
        weeklyWebtoonData.setSubTitle("???93??? ?????????");
        weeklyWebtoonData.setHit("5???");
        latestWebtoons.add(weeklyWebtoonData);
    }
}