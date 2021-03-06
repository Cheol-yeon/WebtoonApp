package com.example.webtoonapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class WeeklyRecycleFragment extends Fragment {

    RecyclerView weeklyRecycle;
    RecyclerView.LayoutManager weeklyRecyclerLayoutManager;
    RecyclerView.Adapter weeklyRecyclerAdapter;

    ArrayList<WeeklyWebtoonData> weeklyWebtoonDatas;
    WeeklyWebtoonData weeklyWebtoonData;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "day";

    // TODO: Rename and change types of parameters
    private String mParam1;

    public WeeklyRecycleFragment() {
        // Required empty public constructor
    }

    public static WeeklyRecycleFragment newInstance(String param1) {
        WeeklyRecycleFragment fragment = new WeeklyRecycleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weekly_recycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        weeklyRecycle = view.findViewById(R.id.rv_weekly);
        weeklyRecycle.setHasFixedSize(true);
        weeklyRecyclerLayoutManager = new GridLayoutManager(requireActivity(),3);
        weeklyRecycle.setLayoutManager(weeklyRecyclerLayoutManager);

        setWeeklyData();
    }

    public void setWeeklyData() {
        weeklyWebtoonDatas = new ArrayList<>();
        if(mParam1 == "Mon" || mParam1 == "Thur" || mParam1 == "Fri" || mParam1 == "Sat" || mParam1 == "Sun" || mParam1 == "Remake") {
            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10608_1620036312.6485.jpg");
            weeklyWebtoonData.setTitle("???????????? ???????????? ??????");
            weeklyWebtoonData.setSubTitle("???345???");
            weeklyWebtoonData.setHit("44???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10850_1646644683.0066.jpg");
            weeklyWebtoonData.setTitle("?????? ????????? ???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???32???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10242_1552874447.8449.jpg");
            weeklyWebtoonData.setTitle("?????????");
            weeklyWebtoonData.setSubTitle("???595???");
            weeklyWebtoonData.setHit("13???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10858_1646894514.7846.jpg");
            weeklyWebtoonData.setTitle("??? ????????? ??????");
            weeklyWebtoonData.setSubTitle("???45??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10870_1648555205.3122.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???52???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10663_1625193390.61.jpg");
            weeklyWebtoonData.setTitle("????????? ????????????");
            weeklyWebtoonData.setSubTitle("???200???");
            weeklyWebtoonData.setHit("48???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10229_1551329307.5441.jpg");
            weeklyWebtoonData.setTitle("?????????");
            weeklyWebtoonData.setSubTitle("???396???");
            weeklyWebtoonData.setHit("12???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10847_1646971047.4652.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???30???");
            weeklyWebtoonData.setHit("3.0???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10333_1564369661.5709.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???508???");
            weeklyWebtoonData.setHit("4.8???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10822_1644826219.0029.jpg");
            weeklyWebtoonData.setTitle("??????, ?????? ???????????????!");
            weeklyWebtoonData.setSubTitle("???168???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10683_1626345727.7418.jpg");
            weeklyWebtoonData.setTitle("???????????????");
            weeklyWebtoonData.setSubTitle("???121???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10609_1619599386.8101.jpg");
            weeklyWebtoonData.setTitle("?????????, ???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???289??? ?????????");
            weeklyWebtoonData.setHit("49???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10377_1568707397.4925.jpg");
            weeklyWebtoonData.setTitle("????????? 11??????");
            weeklyWebtoonData.setSubTitle("???118??? ?????????");
            weeklyWebtoonData.setHit("102???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10829_1645411161.9839.jpg");
            weeklyWebtoonData.setTitle("???????????????");
            weeklyWebtoonData.setSubTitle("??????1 ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10825_1645175822.0559.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???91??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10826_1645410735.9514.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???208??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10803_1641785683.7242.jpg");
            weeklyWebtoonData.setTitle("??????????????? ??????");
            weeklyWebtoonData.setSubTitle("???60??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10665_1625220322.2119.jpg");
            weeklyWebtoonData.setTitle("???????????? ????????????");
            weeklyWebtoonData.setSubTitle("??????2 ???50??? ?????????");
            weeklyWebtoonData.setHit("1.3???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10661_1625192924.9361.jpg");
            weeklyWebtoonData.setTitle("????????? ????????? ???????????????.");
            weeklyWebtoonData.setSubTitle("???51??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8859_1525393508.0471.jpg");
            weeklyWebtoonData.setTitle("??????, ??????");
            weeklyWebtoonData.setSubTitle("???49??? ?????????");
            weeklyWebtoonData.setHit("182???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9463_1549011485.5343.jpg");
            weeklyWebtoonData.setTitle("?????? ??????, ??????!");
            weeklyWebtoonData.setSubTitle("???301??? ?????????");
            weeklyWebtoonData.setHit("66???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10541_1599189957.4978.jpg");
            weeklyWebtoonData.setTitle("????????? ????????????");
            weeklyWebtoonData.setSubTitle("???38??? ?????????");
            weeklyWebtoonData.setHit("8.3???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10682_1626345662.0359.jpg");
            weeklyWebtoonData.setTitle("?????? ?????? ????????????");
            weeklyWebtoonData.setSubTitle("??????1 ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10409_1582878801.6759.jpg");
            weeklyWebtoonData.setTitle("??? ??? ?????? ??????");
            weeklyWebtoonData.setSubTitle("???57??? ?????????");
            weeklyWebtoonData.setHit("29???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8479_1525334192.3962.jpg");
            weeklyWebtoonData.setTitle("??????????????? ???");
            weeklyWebtoonData.setSubTitle("???38??? ?????????");
            weeklyWebtoonData.setHit("15???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10681_1626345596.6749.jpg");
            weeklyWebtoonData.setTitle("?????? ?????? ????????? ??????");
            weeklyWebtoonData.setSubTitle("??????1 ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8896_1525324961.8075.jpg");
            weeklyWebtoonData.setTitle("????????? ?????????");
            weeklyWebtoonData.setSubTitle("???35??? ?????????");
            weeklyWebtoonData.setHit("18???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8995_1503372321.5861.jpg");
            weeklyWebtoonData.setTitle("?????? ???!");
            weeklyWebtoonData.setSubTitle("???68??? ?????????");
            weeklyWebtoonData.setHit("5.0???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/7438_1526621901.7552.jpg");
            weeklyWebtoonData.setTitle("????????? ?????????");
            weeklyWebtoonData.setSubTitle("???26??? ?????????");
            weeklyWebtoonData.setHit("147???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10290_1557369462.428.jpg");
            weeklyWebtoonData.setTitle("seven");
            weeklyWebtoonData.setSubTitle("??????1 ???189??? ?????????");
            weeklyWebtoonData.setHit("3.3???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/3800_1527053771.9733.jpg");
            weeklyWebtoonData.setTitle("??????:??? ??????");
            weeklyWebtoonData.setSubTitle("???44??? ?????????");
            weeklyWebtoonData.setHit("42???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10063_1525333999.2016.jpg");
            weeklyWebtoonData.setTitle("7??? ??????");
            weeklyWebtoonData.setSubTitle("???36???");
            weeklyWebtoonData.setHit("2.8???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8156_1525326427.485.jpg");
            weeklyWebtoonData.setTitle("?????????");
            weeklyWebtoonData.setSubTitle("???38??? ?????????");
            weeklyWebtoonData.setHit("16???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8972_1525393703.2779.jpg");
            weeklyWebtoonData.setTitle("??????");
            weeklyWebtoonData.setSubTitle("???30??? ?????????");
            weeklyWebtoonData.setHit("15???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10352_1566290302.4593.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???166??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10234_1551329811.1858.jpg");
            weeklyWebtoonData.setTitle("????????? ?????????");
            weeklyWebtoonData.setSubTitle("???93??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

        } else if (mParam1 == "Thu") {
            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10802_1641785551.1803.jpg");
            weeklyWebtoonData.setTitle("???????????? ?????? ??????");
            weeklyWebtoonData.setSubTitle("???75???");
            weeklyWebtoonData.setHit("2.3???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10242_1552874447.8449.jpg");
            weeklyWebtoonData.setTitle("?????????");
            weeklyWebtoonData.setSubTitle("???595???");
            weeklyWebtoonData.setHit("13???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10876_1649209377.2602.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???104???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10806_1642490978.5488.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???28???");
            weeklyWebtoonData.setHit("2.0???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10663_1625193390.61.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???124???");
            weeklyWebtoonData.setHit("8.9???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10818_1644220372.3964.jpg");
            weeklyWebtoonData.setTitle("??????????????? ?????????");
            weeklyWebtoonData.setSubTitle("???48???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10871_1648641556.8514.jpg");
            weeklyWebtoonData.setTitle("??????: ????????? ????????????");
            weeklyWebtoonData.setSubTitle("???102???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10847_1646971047.4652.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???31???");
            weeklyWebtoonData.setHit("3.0???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10811_1644223649.7517.jpg");
            weeklyWebtoonData.setTitle("??? ????????? ?????????");
            weeklyWebtoonData.setSubTitle("???65???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10609_1619599386.8101.jpg");
            weeklyWebtoonData.setTitle("?????????, ???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???289??? ?????????");
            weeklyWebtoonData.setHit("49???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8322_1525394231.8298.jpg");
            weeklyWebtoonData.setTitle("????????????? ?????????????");
            weeklyWebtoonData.setSubTitle("???473???");
            weeklyWebtoonData.setHit("126???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10384_1598851294.5814.jpg");
            weeklyWebtoonData.setTitle("SHE");
            weeklyWebtoonData.setSubTitle("???74??? ?????????");
            weeklyWebtoonData.setHit("52???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10413_1573809389.4239.jpg");
            weeklyWebtoonData.setTitle("????????? ??????[?????????]");
            weeklyWebtoonData.setSubTitle("???88???");
            weeklyWebtoonData.setHit("3.4???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10854_1646962017.5802.jpg");
            weeklyWebtoonData.setTitle("??????????????? ?????????");
            weeklyWebtoonData.setSubTitle("???4??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10590_1612338793.8826.jpg");
            weeklyWebtoonData.setTitle("????????? ?????????");
            weeklyWebtoonData.setSubTitle("???30??? ?????????");
            weeklyWebtoonData.setHit("15???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10450_1582881801.9822.jpg");
            weeklyWebtoonData.setTitle("??????:???");
            weeklyWebtoonData.setSubTitle("???63??? ?????????");
            weeklyWebtoonData.setHit("21???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8989_1503629038.2688.jpg");
            weeklyWebtoonData.setTitle("??????????????? ?????????");
            weeklyWebtoonData.setSubTitle("???84??? ?????????");
            weeklyWebtoonData.setHit("198???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10338_1569227969.7826.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???101??? ?????????");
            weeklyWebtoonData.setHit("5.7???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9166_1525326692.9585.jpg");
            weeklyWebtoonData.setTitle("?????? ?????? ????????? ????????? ?????????");
            weeklyWebtoonData.setSubTitle("???65??? ?????????");
            weeklyWebtoonData.setHit("39???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8158_1525334575.5413.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???39??? ?????????");
            weeklyWebtoonData.setHit("134???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8314_1525336437.0552.jpg");
            weeklyWebtoonData.setTitle("????????? ????????? ??????");
            weeklyWebtoonData.setSubTitle("??????1 ???103??? ?????????");
            weeklyWebtoonData.setHit("38???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/586_1525335381.3884.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???154??? ?????????");
            weeklyWebtoonData.setHit("114???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/5015_1525394342.7532.jpg");
            weeklyWebtoonData.setTitle("?????? ?????????");
            weeklyWebtoonData.setSubTitle("???67??? ?????????");
            weeklyWebtoonData.setHit("111???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/5324_1526620643.7695.jpg");
            weeklyWebtoonData.setTitle("?????? ??????2");
            weeklyWebtoonData.setSubTitle("???51??? ?????????");
            weeklyWebtoonData.setHit("61???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8990_1503372555.8095.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???28??? ?????????");
            weeklyWebtoonData.setHit("5.4???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10160_1542950894.2044.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???121??? ?????????");
            weeklyWebtoonData.setHit("4.5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10007_1525336024.201.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???24??? ?????????");
            weeklyWebtoonData.setHit("3.2???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8428_1525394293.884.jpg");
            weeklyWebtoonData.setTitle("????????? ????????? ??????");
            weeklyWebtoonData.setSubTitle("???36??? ?????????");
            weeklyWebtoonData.setHit("13???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10348_1566282030.2524.jpg");
            weeklyWebtoonData.setTitle("????????? : ??????????????? ??????");
            weeklyWebtoonData.setSubTitle("???80??? ?????????");
            weeklyWebtoonData.setHit("1.7???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9246_1525326729.3162.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???30??? ?????????");
            weeklyWebtoonData.setHit("20???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10261_1554108262.0244.jpg");
            weeklyWebtoonData.setTitle("??????");
            weeklyWebtoonData.setSubTitle("???48??? ?????????");
            weeklyWebtoonData.setHit("1.0???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

        } else if (mParam1 == "Wed") {
            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10850_1646644683.0066.jpg");
            weeklyWebtoonData.setTitle("?????? ????????? ???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???33???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10568_1604900784.8934.jpg");
            weeklyWebtoonData.setTitle("???????????? ???????????? ?????? ??????");
            weeklyWebtoonData.setSubTitle("???414???");
            weeklyWebtoonData.setHit("96???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10872_1649397595.3984.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???251???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10887_1648806006.937.jpg");
            weeklyWebtoonData.setTitle("???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???34???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10873_1649743138.8721.jpg");
            weeklyWebtoonData.setTitle("???????????????");
            weeklyWebtoonData.setSubTitle("???141???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10859_1646896306.4326.jpg");
            weeklyWebtoonData.setTitle("????????? ????????????");
            weeklyWebtoonData.setSubTitle("???80??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10828_1645411050.302.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???138???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10899_1649844820.5237.jpg");
            weeklyWebtoonData.setTitle("?????????, ??? ?????????, ????????????!");
            weeklyWebtoonData.setSubTitle("???1???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10886_1648805268.204.jpg");
            weeklyWebtoonData.setTitle("???????????? ?????????");
            weeklyWebtoonData.setSubTitle("???16???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10532_1596439274.2237.jpg");
            weeklyWebtoonData.setTitle("????????? ???????????????");
            weeklyWebtoonData.setSubTitle("???211???");
            weeklyWebtoonData.setHit("29???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10830_1645410926.2109.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???95???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10245_1552357810.9013.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???515???");
            weeklyWebtoonData.setHit("7.1???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10699_1628156242.5851.jpg");
            weeklyWebtoonData.setTitle("???????????? ??? ????????? ?????????");
            weeklyWebtoonData.setSubTitle("???114???");
            weeklyWebtoonData.setHit("3.8???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10847_1646971047.4652.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???32???");
            weeklyWebtoonData.setHit("3.1???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10330_1638840498.5224.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("??????2 ???22???");
            weeklyWebtoonData.setHit("3.6???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10700_1628156050.969.jpg");
            weeklyWebtoonData.setTitle("???????????? ????????? ??????");
            weeklyWebtoonData.setSubTitle("???114???");
            weeklyWebtoonData.setHit("5.4???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10634_1640604653.6457.jpg");
            weeklyWebtoonData.setTitle("?????? ?????? ??????");
            weeklyWebtoonData.setSubTitle("???18??? ?????????");
            weeklyWebtoonData.setHit("1.7???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10449_1580197487.7602.jpg");
            weeklyWebtoonData.setTitle("????????? ??? ???????????????");
            weeklyWebtoonData.setSubTitle("???238???");
            weeklyWebtoonData.setHit("84???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10795_1641173153.1999.jpg");
            weeklyWebtoonData.setTitle("???????????? ??????????????? ??????????????????");
            weeklyWebtoonData.setSubTitle("???59???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10785_1638926112.7979.jpg");
            weeklyWebtoonData.setTitle("??? ????????? ????????????");
            weeklyWebtoonData.setSubTitle("???71???");
            weeklyWebtoonData.setHit("1.7???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10610_1620039770.1825.jpg");
            weeklyWebtoonData.setTitle("????????? ??????: ????????? ????????? ???");
            weeklyWebtoonData.setSubTitle("???95??? (??????2)");
            weeklyWebtoonData.setHit("2.4???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10609_1619599386.8101.jpg");
            weeklyWebtoonData.setTitle("?????????, ???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???289??? ?????????");
            weeklyWebtoonData.setHit("49???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10790_1640252848.2317.jpg");
            weeklyWebtoonData.setTitle("???????????? ???????????? ??????");
            weeklyWebtoonData.setSubTitle("???32??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10794_1641172764.1986.jpg");
            weeklyWebtoonData.setTitle("?????? ????????? ??????");
            weeklyWebtoonData.setSubTitle("???59???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10784_1638925951.9581.jpg");
            weeklyWebtoonData.setTitle("???????????? ?????? ????????? ???????????????");
            weeklyWebtoonData.setSubTitle("???71???");
            weeklyWebtoonData.setHit("2.2???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10815_1644219619.8302.jpg");
            weeklyWebtoonData.setTitle("????????? ??????");
            weeklyWebtoonData.setSubTitle("???49???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9811_1525334172.5868.jpg");
            weeklyWebtoonData.setTitle("????????????");
            weeklyWebtoonData.setSubTitle("???416??? ?????????");
            weeklyWebtoonData.setHit("23???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10812_1644222273.2999.jpg");
            weeklyWebtoonData.setTitle("?????? 2?????? 1");
            weeklyWebtoonData.setSubTitle("???112???");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10855_1646962607.1397.jpg");
            weeklyWebtoonData.setTitle("????????? ???????????? ????????????");
            weeklyWebtoonData.setSubTitle("???2??? ?????????");
            weeklyWebtoonData.setHit("5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10586_1614672726.6737.jpg");
            weeklyWebtoonData.setTitle("??????????????? ??????");
            weeklyWebtoonData.setSubTitle("??????1 ?????????");
            weeklyWebtoonData.setHit("6.6???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9605_1549011676.0995.jpg");
            weeklyWebtoonData.setTitle("???????????? ??????");
            weeklyWebtoonData.setSubTitle("???102??? ?????????");
            weeklyWebtoonData.setHit("80???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10415_1582094039.3946.jpg");
            weeklyWebtoonData.setTitle("H-mate");
            weeklyWebtoonData.setSubTitle("???75??? ?????????");
            weeklyWebtoonData.setHit("47???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10125_1554963604.3303.gif");
            weeklyWebtoonData.setTitle("????????? ?????????");
            weeklyWebtoonData.setSubTitle("???170??? ?????????");
            weeklyWebtoonData.setHit("81???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10395_1571044275.0403.jpg");
            weeklyWebtoonData.setTitle("?????????");
            weeklyWebtoonData.setSubTitle("??????2 ???36??? ?????????");
            weeklyWebtoonData.setHit("9.5???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10273_1556243522.5508.jpg");
            weeklyWebtoonData.setTitle("??? ????????? 16???");
            weeklyWebtoonData.setSubTitle("???206??? ?????????");
            weeklyWebtoonData.setHit("18???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

            weeklyWebtoonData = new WeeklyWebtoonData();
            weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10301_1558422314.5707.jpg");
            weeklyWebtoonData.setTitle("?????????");
            weeklyWebtoonData.setSubTitle("???53??? ?????????");
            weeklyWebtoonData.setHit("5.4???");
            weeklyWebtoonDatas.add(weeklyWebtoonData);

        }
        weeklyRecyclerAdapter = new WeeklyRecyclerViewAdapter(weeklyWebtoonDatas, requireActivity());
        weeklyRecycle.setAdapter(weeklyRecyclerAdapter);
    }
}