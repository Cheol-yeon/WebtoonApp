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
        weeklyWebtoonData.setTitle("대표님의 삐뚤어진 사랑");
        weeklyWebtoonData.setSubTitle("제345화");
        weeklyWebtoonData.setHit("44만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10850_1646644683.0066.jpg");
        weeklyWebtoonData.setTitle("전설 헌터로 키워지는 중입니다");
        weeklyWebtoonData.setSubTitle("제32화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10242_1552874447.8449.jpg");
        weeklyWebtoonData.setTitle("영검존");
        weeklyWebtoonData.setSubTitle("제595화");
        weeklyWebtoonData.setHit("13만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10858_1646894514.7846.jpg");
        weeklyWebtoonData.setTitle("그 남자의 계략");
        weeklyWebtoonData.setSubTitle("제45화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10870_1648555205.3122.jpg");
        weeklyWebtoonData.setTitle("만고지존");
        weeklyWebtoonData.setSubTitle("제52화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10663_1625193390.61.jpg");
        weeklyWebtoonData.setTitle("대표님 살살해요");
        weeklyWebtoonData.setSubTitle("제200화");
        weeklyWebtoonData.setHit("48만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10229_1551329307.5441.jpg");
        weeklyWebtoonData.setTitle("요신기");
        weeklyWebtoonData.setSubTitle("제396화");
        weeklyWebtoonData.setHit("12만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10847_1646971047.4652.jpg");
        weeklyWebtoonData.setTitle("신혼좀비");
        weeklyWebtoonData.setSubTitle("제30화");
        weeklyWebtoonData.setHit("3.0만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10333_1564369661.5709.jpg");
        weeklyWebtoonData.setTitle("만계선종");
        weeklyWebtoonData.setSubTitle("제508화");
        weeklyWebtoonData.setHit("4.8만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10822_1644826219.0029.jpg");
        weeklyWebtoonData.setTitle("폐하, 옥체 보존하세요!");
        weeklyWebtoonData.setSubTitle("제168화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10683_1626345727.7418.jpg");
        weeklyWebtoonData.setTitle("워너비스타");
        weeklyWebtoonData.setSubTitle("제121화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10609_1619599386.8101.jpg");
        weeklyWebtoonData.setTitle("대표님, 사모님이 도망가요");
        weeklyWebtoonData.setSubTitle("제289화 최종화");
        weeklyWebtoonData.setHit("49만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10377_1568707397.4925.jpg");
        weeklyWebtoonData.setTitle("그녀의 11센티");
        weeklyWebtoonData.setSubTitle("제118화 최종화");
        weeklyWebtoonData.setHit("102만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10829_1645411161.9839.jpg");
        weeklyWebtoonData.setTitle("제존회귀록");
        weeklyWebtoonData.setSubTitle("시즌1 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10825_1645175822.0559.jpg");
        weeklyWebtoonData.setTitle("난세신벌");
        weeklyWebtoonData.setSubTitle("제91화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10826_1645410735.9514.jpg");
        weeklyWebtoonData.setTitle("만계신주");
        weeklyWebtoonData.setSubTitle("제208화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10803_1641785683.7242.jpg");
        weeklyWebtoonData.setTitle("어이상실의 시대");
        weeklyWebtoonData.setSubTitle("제60화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10665_1625220322.2119.jpg");
        weeklyWebtoonData.setTitle("황비님의 비밀수업");
        weeklyWebtoonData.setSubTitle("시즌2 제50화 최종화");
        weeklyWebtoonData.setHit("1.3만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10661_1625192924.9361.jpg");
        weeklyWebtoonData.setTitle("고양이 카페로 초대합니다.");
        weeklyWebtoonData.setSubTitle("제51화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8859_1525393508.0471.jpg");
        weeklyWebtoonData.setTitle("그녀, 윤희");
        weeklyWebtoonData.setSubTitle("제49화 최종화");
        weeklyWebtoonData.setHit("182만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/9463_1549011485.5343.jpg");
        weeklyWebtoonData.setTitle("보스 오빠, 제발!");
        weeklyWebtoonData.setSubTitle("제301화 최종화");
        weeklyWebtoonData.setHit("66만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10541_1599189957.4978.jpg");
        weeklyWebtoonData.setTitle("아내가 돌아왔다");
        weeklyWebtoonData.setSubTitle("제38화 최종화");
        weeklyWebtoonData.setHit("8.3만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10682_1626345662.0359.jpg");
        weeklyWebtoonData.setTitle("오늘 그가 돌아왔다");
        weeklyWebtoonData.setSubTitle("시즌1 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10409_1582878801.6759.jpg");
        weeklyWebtoonData.setTitle("알 수 없는 마음");
        weeklyWebtoonData.setSubTitle("제57화 최종화");
        weeklyWebtoonData.setHit("29만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8479_1525334192.3962.jpg");
        weeklyWebtoonData.setTitle("패러사이트 퀸");
        weeklyWebtoonData.setSubTitle("제38화 최종화");
        weeklyWebtoonData.setHit("15만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10681_1626345596.6749.jpg");
        weeklyWebtoonData.setTitle("예쁜 남자 잘생긴 여자");
        weeklyWebtoonData.setSubTitle("시즌1 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8896_1525324961.8075.jpg");
        weeklyWebtoonData.setTitle("그래도 사랑해");
        weeklyWebtoonData.setSubTitle("제35화 최종화");
        weeklyWebtoonData.setHit("18만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8995_1503372321.5861.jpg");
        weeklyWebtoonData.setTitle("아임 펫!");
        weeklyWebtoonData.setSubTitle("제68화 최종화");
        weeklyWebtoonData.setHit("5.0만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/7438_1526621901.7552.jpg");
        weeklyWebtoonData.setTitle("힙찔이 빙진호");
        weeklyWebtoonData.setSubTitle("제26화 최종화");
        weeklyWebtoonData.setHit("147만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10290_1557369462.428.jpg");
        weeklyWebtoonData.setTitle("seven");
        weeklyWebtoonData.setSubTitle("시즌1 제189화 최종화");
        weeklyWebtoonData.setHit("3.3만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/3800_1527053771.9733.jpg");
        weeklyWebtoonData.setTitle("산군:활 제로");
        weeklyWebtoonData.setSubTitle("제44화 최종화");
        weeklyWebtoonData.setHit("42만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10063_1525333999.2016.jpg");
        weeklyWebtoonData.setTitle("7의 잔재");
        weeklyWebtoonData.setSubTitle("제36화");
        weeklyWebtoonData.setHit("2.8만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8156_1525326427.485.jpg");
        weeklyWebtoonData.setTitle("경계인");
        weeklyWebtoonData.setSubTitle("제38화 최종화");
        weeklyWebtoonData.setHit("16만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/8972_1525393703.2779.jpg");
        weeklyWebtoonData.setTitle("블랙");
        weeklyWebtoonData.setSubTitle("제30화 최종화");
        weeklyWebtoonData.setHit("15만");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10352_1566290302.4593.jpg");
        weeklyWebtoonData.setTitle("현호전기");
        weeklyWebtoonData.setSubTitle("제166화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);

        weeklyWebtoonData = new WeeklyWebtoonData();
        weeklyWebtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb12/10234_1551329811.1858.jpg");
        weeklyWebtoonData.setTitle("굴다리 블루스");
        weeklyWebtoonData.setSubTitle("제93화 최종화");
        weeklyWebtoonData.setHit("5천");
        latestWebtoons.add(weeklyWebtoonData);
    }
}