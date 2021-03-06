package com.example.webtoonapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    RadioButton radioButtonKeyword1,
            radioButtonKeyword2,
            radioButtonKeyword3,
            radioButtonKeyword4,
            radioButtonKeyword5,
            radioButtonKeyword6,
            radioButtonKeyword7,
            radioButtonKeyword8;

    RadioButton radioButtonRecommand1,
            radioButtonRecommand2,
            radioButtonRecommand3,
            radioButtonRecommand4,
            radioButtonRecommand5,
            radioButtonRecommand6,
            radioButtonRecommand7,
            radioButtonRecommand8;


    ArrayList<WebtoonData> webtoonDataArrayList;
    WebtoonData webtoonData;

    ViewPager2 viewPager2_banner, viewPager2_ranking, viewPager2_event;
    private LinearLayout layoutIndicator;
    TabLayout tabLayout;
    RadioGroup radioGroupKeyword;

    private RecyclerView keyWordRecycle;
    private RecyclerView.Adapter keyWordRecycleAdapter;
    private RecyclerView.LayoutManager keyWordRecycleLayoutManager;

    private RecyclerView recommandRecycle;
    private RecyclerView.Adapter recommandRecycleAdapter;
    private RecyclerView.LayoutManager recommandRecycleLayoutManager;

    private RecyclerView waitRecycle;
    private RecyclerView.Adapter waitRecycleAdapter;
    private RecyclerView.LayoutManager waitRecycleLayoutManager;

    private RecyclerView coinRecycle;
    private RecyclerView.Adapter coinRecycleAdapter;
    private RecyclerView.LayoutManager coinRecycleLayoutManager;

    private String[] images = new String[]{
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/10017_1626067667.9501.png",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/12459_1646045778.3586.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/9889_1645603245.6129.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/12564_1647480946.766.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/12548_1647229344.7918.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/10128_1612516976.1911.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/10466_1625029486.3514.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/10129_1612516915.8922.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/10130_1612516944.6079.png",
            "https://shtosebzjw.akamaized.net/assets/upfile/banner/12549_1647229540.3236.jpg"
    };

    private String[] images_event = new String[]{
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/396_12161.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/162_19811.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/234_17061.png",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/340_15811.png",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/61_13501.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/94_10841.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/133_10691.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/240_13351.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/200_12861.jpg",
            "https://shtosebzjw.akamaized.net/assets/upfile/event_thumb/395_17081.png"
    };

    public MainFragment() {
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
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        configViews(view);

        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // ?????????
        layoutIndicator = view.findViewById(R.id.layoutIndicators);
        viewPager2_banner = view.findViewById(R.id.vp2_banner);
        viewPager2_ranking = view.findViewById(R.id.vp2_ranking);
        viewPager2_event = view.findViewById(R.id.vp2_eventbanner);
        tabLayout = view.findViewById(R.id.tl_ranking);
        keyWordRecycle = view.findViewById(R.id.rv_keyWord);
        recommandRecycle = view.findViewById(R.id.rv_recommand);
        waitRecycle = view.findViewById(R.id.rv_waitFree);
        coinRecycle = view.findViewById(R.id.rv_1coin);

        // ????????? ????????? ????????????2 ??????
        viewPager2_banner.setOffscreenPageLimit(1);
        viewPager2_ranking.setOffscreenPageLimit(2);
        viewPager2_event.setOffscreenPageLimit(2);

        // viewPager2_banner
        // ????????????2 ????????? ??????
        viewPager2_banner.setAdapter(new BannerAdapter(this.getContext(), images));

        // ?????? ????????? ??? ?????? ??????????????? ?????????
        viewPager2_banner.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position >= images.length) {
                    position = position % images.length;
                }
                setCurrentIndicator(position);
            }
        });
        setupIndicators(images.length);

        // viewPager2_event
        viewPager2_event.setAdapter(new EventAdapter(this.getContext(), images_event));

        //viewPager2_ranking
        // ????????????2?????? ?????? ????????? ??????????????? ???????????? ??????
        viewPager2_ranking.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
//                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2_ranking.setPageTransformer(compositePageTransformer);

//        SpringDotsIndicator indicator = view.findViewById(R.id.layoutIndicators);
//        indicator.setViewPager2(viewPager2_banner);

        viewPager2_ranking.setAdapter(new RankingAdapter(this.getActivity()));
        // ???????????? ??? ??????????????? ?????? ????????? ViewPager2 ??????
        new TabLayoutMediator(tabLayout, viewPager2_ranking, (tab, position) -> {

            switch (position) {
                case 0: {
                    tab.setText("?????????");
                    break;
                }
                case 1: {
                    tab.setText("????????????");
                    break;
                }
                case 2: {
                    tab.setText("??????");
                    break;
                }
                case 3: {
                    tab.setText("??????");
                    break;
                }
            }

        }).attach();

        // ?????? ???????????? RecyclerView ?????? ????????? ??????
        keyWordRecycle.setHasFixedSize(true);
        keyWordRecycleLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        keyWordRecycle.setLayoutManager(keyWordRecycleLayoutManager);

        recommandRecycle.setHasFixedSize(true);
        recommandRecycleLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        recommandRecycle.setLayoutManager(recommandRecycleLayoutManager);

        waitRecycle.setHasFixedSize(true);
        waitRecycleLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        waitRecycle.setLayoutManager(waitRecycleLayoutManager);

        coinRecycle.setHasFixedSize(true);
        coinRecycleLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        coinRecycle.setLayoutManager(coinRecycleLayoutManager);

        getKeywordData(1);
        getRecommandData(1);
        getWaitData();
        getCoinData();

    }

    // ????????????2 ????????? ?????? ????????? ??????
    private void setupIndicators(int count) {
        ImageFilterView[] indicators = new ImageFilterView[count];
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params.setMargins(12, 8, 12, 8);

        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageFilterView(this.getContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(this.getContext(),
                    R.drawable.bg_indicator_inactive));
            indicators[i].setLayoutParams(params);
            layoutIndicator.addView(indicators[i]);

            layoutIndicator.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
        setCurrentIndicator(0);
    }

    // ?????????????????? ???????????? ????????? ??????
    private void setCurrentIndicator(int position) {
        int childCount = layoutIndicator.getChildCount();
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            ImageFilterView imageView = (ImageFilterView) layoutIndicator.getChildAt(i);
            if (i == position) {
                imageView.setImageDrawable(ContextCompat.getDrawable(
                        this.getContext(),
                        R.drawable.bg_indicator_active
                ));
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(
                        this.getContext(),
                        R.drawable.bg_indicator_inactive
                ));
            }
        }
    }

    // Fragment ?????? OnClickListener??? ????????? ??? ?????? ?????? ?????? ??????
    public void configViews(View view) {

        radioGroupKeyword = view.findViewById(R.id.rg_filter1);
        int selectedId = radioGroupKeyword.getCheckedRadioButtonId();

        radioButtonKeyword1 = view.findViewById(R.id.rb_button1);
        radioButtonKeyword2 = view.findViewById(R.id.rb_button2);
        radioButtonKeyword3 = view.findViewById(R.id.rb_button3);
        radioButtonKeyword4 = view.findViewById(R.id.rb_button4);
        radioButtonKeyword5 = view.findViewById(R.id.rb_button5);
        radioButtonKeyword6 = view.findViewById(R.id.rb_button6);
        radioButtonKeyword7 = view.findViewById(R.id.rb_button7);
        radioButtonKeyword8 = view.findViewById(R.id.rb_button8);

        radioButtonRecommand1 = view.findViewById(R.id.rb_button1_2);
        radioButtonRecommand2 = view.findViewById(R.id.rb_button2_2);
        radioButtonRecommand3 = view.findViewById(R.id.rb_button3_2);
        radioButtonRecommand4 = view.findViewById(R.id.rb_button4_2);
        radioButtonRecommand5 = view.findViewById(R.id.rb_button5_2);
        radioButtonRecommand6 = view.findViewById(R.id.rb_button6_2);
        radioButtonRecommand7 = view.findViewById(R.id.rb_button7_2);
        radioButtonRecommand8 = view.findViewById(R.id.rb_button8_2);

        radioButtonKeyword1.setOnClickListener(this::onClick);
        radioButtonKeyword2.setOnClickListener(this::onClick);
        radioButtonKeyword3.setOnClickListener(this::onClick);
        radioButtonKeyword4.setOnClickListener(this::onClick);
        radioButtonKeyword5.setOnClickListener(this::onClick);
        radioButtonKeyword6.setOnClickListener(this::onClick);
        radioButtonKeyword7.setOnClickListener(this::onClick);
        radioButtonKeyword8.setOnClickListener(this::onClick);

        radioButtonRecommand1.setOnClickListener(this::onClick2);
        radioButtonRecommand2.setOnClickListener(this::onClick2);
        radioButtonRecommand3.setOnClickListener(this::onClick2);
        radioButtonRecommand4.setOnClickListener(this::onClick2);
        radioButtonRecommand5.setOnClickListener(this::onClick2);
        radioButtonRecommand6.setOnClickListener(this::onClick2);
        radioButtonRecommand7.setOnClickListener(this::onClick2);
        radioButtonRecommand8.setOnClickListener(this::onClick2);
    }

    // RadioGroup ?????????????????? ????????? ?????? LinearLayout??? ?????????????????? ??????????????? ?????? ??????????????? ???????????? ??????
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rb_button1: {
                Log.e("onClick", "rb_button1");
                if (radioButtonKeyword1.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(1);
                break;
            }
            case R.id.rb_button2: {
                Log.e("onClick", "rb_button2");
                if (radioButtonKeyword2.isChecked() == true) {
                    radioButtonKeyword1.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(2);
                break;
            }
            case R.id.rb_button3: {
                Log.e("onClick", "rb_button3");
                if (radioButtonKeyword3.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword1.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(3);
                break;
            }
            case R.id.rb_button4: {
                Log.e("onClick", "rb_button4");
                if (radioButtonKeyword4.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword1.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(4);
                break;
            }
            case R.id.rb_button5: {
                Log.e("onClick", "rb_button5");
                if (radioButtonKeyword5.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword1.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(5);
                break;
            }
            case R.id.rb_button6: {
                Log.e("onClick", "rb_button6");
                if (radioButtonKeyword6.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword1.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(6);
                break;
            }
            case R.id.rb_button7: {
                Log.e("onClick", "rb_button7");
                if (radioButtonKeyword7.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword1.setChecked(false);
                    radioButtonKeyword8.setChecked(false);
                }
                getKeywordData(7);
                break;
            }
            case R.id.rb_button8: {
                Log.e("onClick", "rb_button8");
                if (radioButtonKeyword8.isChecked() == true) {
                    radioButtonKeyword2.setChecked(false);
                    radioButtonKeyword3.setChecked(false);
                    radioButtonKeyword4.setChecked(false);
                    radioButtonKeyword5.setChecked(false);
                    radioButtonKeyword6.setChecked(false);
                    radioButtonKeyword7.setChecked(false);
                    radioButtonKeyword1.setChecked(false);
                }
                getKeywordData(8);
                break;
            }
        }
    }

    public void onClick2(View v) {
        switch (v.getId()) {
            case R.id.rb_button1_2: {
                Log.e("onClick", "rb_button1_2");
                if (radioButtonRecommand1.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(1);
                break;
            }
            case R.id.rb_button2_2: {
                Log.e("onClick", "rb_button2_2");
                if (radioButtonRecommand2.isChecked() == true) {
                    radioButtonRecommand1.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(2);
                break;
            }
            case R.id.rb_button3_2: {
                Log.e("onClick", "rb_button3_2");
                if (radioButtonRecommand3.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand1.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(3);
                break;
            }
            case R.id.rb_button4_2: {
                Log.e("onClick", "rb_button4_2");
                if (radioButtonRecommand4.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand1.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(4);
                break;
            }
            case R.id.rb_button5_2: {
                Log.e("onClick", "rb_button5_2");
                if (radioButtonRecommand5.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand1.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(5);
                break;
            }
            case R.id.rb_button6_2: {
                Log.e("onClick", "rb_button6_2");
                if (radioButtonRecommand6.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand1.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(6);
                break;
            }
            case R.id.rb_button7_2: {
                Log.e("onClick", "rb_button7_2");
                if (radioButtonRecommand7.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand1.setChecked(false);
                    radioButtonRecommand8.setChecked(false);
                }
                getRecommandData(7);
                break;
            }
            case R.id.rb_button8_2: {
                Log.e("onClick", "rb_button8_2");
                if (radioButtonRecommand8.isChecked() == true) {
                    radioButtonRecommand2.setChecked(false);
                    radioButtonRecommand3.setChecked(false);
                    radioButtonRecommand4.setChecked(false);
                    radioButtonRecommand5.setChecked(false);
                    radioButtonRecommand6.setChecked(false);
                    radioButtonRecommand7.setChecked(false);
                    radioButtonRecommand1.setChecked(false);
                }
                getRecommandData(8);
                break;
            }
        }
    }

    // ?????? ????????? ?????? ????????? Data?????? ??? RecyclerView??? ??????
    public void getKeywordData(int btnNo) {
        webtoonDataArrayList = new ArrayList<>();

        if (btnNo == 1) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10838_1648718702.0184.jpg");
            webtoonData.setTitle("???(???)");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10291_1558085744.2081.jpg");
            webtoonData.setTitle("???????????? ?????????");
            webtoonData.setSub_title("????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/2631_1550797351.4958.jpg");
            webtoonData.setTitle("?????????K");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10847_1646971047.4575.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/5412_1580460555.8698.jpg");
            webtoonData.setTitle("????????? ?????????");
            webtoonData.setSub_title("?????????&????????? ?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 2 || btnNo == 4) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10838_1648718702.0184.jpg");
            webtoonData.setTitle("???(???)");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10855_1646962607.1277.jpg");
            webtoonData.setTitle("????????? ???????????? ????????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10847_1646971047.4575.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10854_1646962017.567.jpg");
            webtoonData.setTitle("??????????????? ?????????");
            webtoonData.setSub_title("??????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10839_1646707637.0069.png");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("???????????????&?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 3) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10806_1642490978.5388.jpg");
            webtoonData.setTitle("????????? ??????");
            webtoonData.setSub_title("0510&??????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10200_1550461930.3529.jpg");
            webtoonData.setTitle("??????");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10300_1560234034.5599.jpg");
            webtoonData.setTitle("Mad:?????????");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10634_1640604653.6298.jpg");
            webtoonData.setTitle("?????? ?????? ??????");
            webtoonData.setSub_title("??????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10860_1646898197.8547.jpg");
            webtoonData.setTitle("?????? ?????? ???");
            webtoonData.setSub_title("??????,?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 5) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10838_1648718702.0184.jpg");
            webtoonData.setTitle("???(???)");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10859_1646896306.429.jpg");
            webtoonData.setTitle("????????? ????????????");
            webtoonData.setSub_title("?????????,??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10871_1648016636.5417.jpg");
            webtoonData.setTitle("??????: ????????? ????????????");
            webtoonData.setSub_title("????????????/???????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10870_1648016298.5089.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("????????????/??? ????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10858_1646894514.7813.jpg");
            webtoonData.setTitle("??? ????????? ??????");
            webtoonData.setSub_title("?????????,?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 6) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10174_1574317553.4498.png");
            webtoonData.setTitle("?????? ??????");
            webtoonData.setSub_title("?????????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10590_1612338793.8735.jpg");
            webtoonData.setTitle("????????? ?????????");
            webtoonData.setSub_title("??????&??????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10563_1603689733.1208.jpg");
            webtoonData.setTitle("?????? ??????");
            webtoonData.setSub_title("?????????&TB Production");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10541_1599189957.4919.jpg");
            webtoonData.setTitle("????????? ????????????");
            webtoonData.setSub_title("??????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10535_1596419741.0281.jpg");
            webtoonData.setTitle("????????? ??????");
            webtoonData.setSub_title("????????????&frog");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 7) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10291_1558085744.2081.jpg");
            webtoonData.setTitle("???????????? ?????????");
            webtoonData.setSub_title("????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/8859_1501840279.2393.jpg");
            webtoonData.setTitle("??????, ??????");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10568_1604900784.8866.jpg");
            webtoonData.setTitle("???????????? ???????????? ?????? ??????");
            webtoonData.setSub_title("Shuibuciyuan&kkworld&Flower");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/8322_1496987995.183.jpg");
            webtoonData.setTitle("????????????? ?????????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/5412_1580460555.8698.jpg");
            webtoonData.setTitle("????????? ?????????");
            webtoonData.setSub_title("?????????&????????? ?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 8) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/5412_1580460555.8698.jpg");
            webtoonData.setTitle("????????? ?????????");
            webtoonData.setSub_title("?????????&????????? ?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/2631_1550797351.4958.jpg");
            webtoonData.setTitle("?????????K");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/1345_1553841689.2188.jpg");
            webtoonData.setTitle("????????? ???");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10303_1559888119.0164.jpg");
            webtoonData.setTitle("?????????");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/8859_1501840279.2393.jpg");
            webtoonData.setTitle("??????, ??????");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);
        }

        keyWordRecycleAdapter = new WebtoonRecyclerViewAdapter(webtoonDataArrayList, getContext());
        keyWordRecycle.setAdapter(keyWordRecycleAdapter);
    }

    public void getRecommandData(int btnNo) {
        webtoonDataArrayList = new ArrayList<>();

        if (btnNo == 1) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10291_1558085744.2081.jpg");
            webtoonData.setTitle("???????????? ?????????");
            webtoonData.setSub_title("????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10561_1602826603.2833.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10639_1623142571.2271.jpg");
            webtoonData.setTitle("????????? ?????? ???");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10663_1625193390.6024.jpg");
            webtoonData.setTitle("????????? ????????????");
            webtoonData.setSub_title("??????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10568_1604900784.8866.jpg");
            webtoonData.setTitle("???????????? ???????????? ?????? ??????");
            webtoonData.setSub_title("Shuibuciyuan&kkworld&Flower");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 2) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10561_1602826603.2833.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/5412_1580460555.8698.jpg");
            webtoonData.setTitle("????????? ?????????");
            webtoonData.setSub_title("?????????&????????? ?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10576_1607593022.2276.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("?????????&?????????H");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10663_1625193390.6024.jpg");
            webtoonData.setTitle("????????? ????????????");
            webtoonData.setSub_title("??????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10704_1627867858.6998.jpg");
            webtoonData.setTitle("?????????");
            webtoonData.setSub_title("?????????&QRQ");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 3) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/2631_1550797351.4958.jpg");
            webtoonData.setTitle("?????????K");
            webtoonData.setSub_title("?????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10838_1648718702.0184.jpg");
            webtoonData.setTitle("???(???)");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10850_1646644682.9942.jpg");
            webtoonData.setTitle("?????? ????????? ???????????? ????????????");
            webtoonData.setSub_title("Beimuliuhuo&Cat Comics");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10448_1579570605.6723.jpg");
            webtoonData.setTitle("?????? ??????");
            webtoonData.setSub_title("??????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/3979_1453854610.8889.jpg");
            webtoonData.setTitle("??????");
            webtoonData.setSub_title("Meen&?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 4) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/1345_1553841689.2188.jpg");
            webtoonData.setTitle("????????? ???");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/3211_1459301291.5446.jpg");
            webtoonData.setTitle("???????????? BBOL??? ????????????");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/7939_1493109178.9834.jpg");
            webtoonData.setTitle("?????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10642_1623822955.9469.jpg");
            webtoonData.setTitle("????????? ???????????????");
            webtoonData.setSub_title("??????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10855_1646962607.1277.jpg");
            webtoonData.setTitle("????????? ???????????? ????????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 5) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10850_1646644682.9942.jpg");
            webtoonData.setTitle("?????? ????????? ???????????? ????????????");
            webtoonData.setSub_title("Beimuliuhuo&Cat Comics");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10802_1641785551.1569.jpg");
            webtoonData.setTitle("???????????? ?????? ??????");
            webtoonData.setSub_title("ZhiNiaoCun&JSCR");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10866_1647591657.2121.jpg");
            webtoonData.setTitle("???????????? ???????????? ?????????!");
            webtoonData.setSub_title("??????&?????????, ??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10848_1646639017.4884.jpg");
            webtoonData.setTitle("?????? ???????????? ????????????");
            webtoonData.setSub_title("doip&?????????&2631");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10586_1614672726.6537.jpg");
            webtoonData.setTitle("??????????????? ??????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 6) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10839_1646707637.0069.png");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("???????????????&?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/7223_1486026549.5581.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("??????&??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10340_1566267954.2236.jpg");
            webtoonData.setTitle("????????? ???????????? : ????????????");
            webtoonData.setSub_title("Bluemoon&Twenty4");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/8450_1497938769.8037.jpg");
            webtoonData.setTitle("???????????? ???");
            webtoonData.setSub_title("?????? ??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10492_1596518995.6398.jpg");
            webtoonData.setTitle("??????");
            webtoonData.setSub_title("??? ?????????");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 7) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10291_1558085744.2081.jpg");
            webtoonData.setTitle("???????????? ?????????");
            webtoonData.setSub_title("????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/1345_1553841689.2188.jpg");
            webtoonData.setTitle("????????? ???");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10847_1646971047.4575.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("??????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10360_1566543133.7083.png");
            webtoonData.setTitle("?????? : ????????? ?????? ???");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10852_1646644078.1351.jpg");
            webtoonData.setTitle("????????? ????????????");
            webtoonData.setSub_title("GUMINGYUEYE&NAMU");
            webtoonDataArrayList.add(webtoonData);
        } else if (btnNo == 8) {
            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10831_1645411113.1267.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("kuyayumu");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10828_1645411050.289.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("LEGEND ANIMATION");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10830_1645410926.1972.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10245_1552357810.8887.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("????????????");
            webtoonDataArrayList.add(webtoonData);

            webtoonData = new WebtoonData();
            webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10826_1645410735.9261.jpg");
            webtoonData.setTitle("????????????");
            webtoonData.setSub_title("?????????");
            webtoonDataArrayList.add(webtoonData);
        }

        recommandRecycleAdapter = new WebtoonRecyclerViewAdapter(webtoonDataArrayList, getContext());
        recommandRecycle.setAdapter(recommandRecycleAdapter);
    }

    public void getWaitData() {
        webtoonDataArrayList = new ArrayList<>();

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10806_1642490978.5388.jpg");
        webtoonData.setTitle("????????? ??????");
        webtoonData.setSub_title("0510&??????&?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10300_1560234034.5599.jpg");
        webtoonData.setTitle("Mad : ?????????");
        webtoonData.setSub_title("?????????&?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10860_1646898197.8547.jpg");
        webtoonData.setTitle("?????? ?????? ???");
        webtoonData.setSub_title("??????,?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10779_1641439329.9598.jpg");
        webtoonData.setTitle("?????????????????? ??? ????????????");
        webtoonData.setSub_title("?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10609_1619599386.7962.jpg");
        webtoonData.setTitle("?????????, ???????????? ????????????");
        webtoonData.setSub_title("Hongshu&Anyouran");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/9993_1515742630.1929.jpg");
        webtoonData.setTitle("??????");
        webtoonData.setSub_title("?????????&?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10867_1647592077.2087.jpg");
        webtoonData.setTitle("????????????");
        webtoonData.setSub_title("????????????&DL.Sir");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10634_1640604653.6298.jpg");
        webtoonData.setTitle("?????? ?????? ??????");
        webtoonData.setSub_title("??????&?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10866_1647591657.2121.jpg");
        webtoonData.setTitle("???????????? ???????????? ?????????!");
        webtoonData.setSub_title("??????&?????????, ??????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10857_1646893667.3302.jpg");
        webtoonData.setTitle("?????? ?????? ??????");
        webtoonData.setSub_title("?????????,??????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10858_1646894514.7813.jpg");
        webtoonData.setTitle("??? ????????? ??????");
        webtoonData.setSub_title("?????????,?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10859_1646896306.429.jpg");
        webtoonData.setTitle("????????? ????????????");
        webtoonData.setSub_title("?????????,??????");
        webtoonDataArrayList.add(webtoonData);

        waitRecycleAdapter = new WebtoonRecyclerViewAdapter2(webtoonDataArrayList, getContext());
        waitRecycle.setAdapter(waitRecycleAdapter);
    }

    public void getCoinData() {
        webtoonDataArrayList = new ArrayList<>();

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10408_1572601697.2488.jpg");
        webtoonData.setTitle("??? ??? ????????????");
        webtoonData.setSub_title("??????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10790_1640248556.607.jpg");
        webtoonData.setTitle("???????????? ???????????? ??????");
        webtoonData.setSub_title("??????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10777_1638417070.3987.jpg");
        webtoonData.setTitle("????????? ????????? ??????");
        webtoonData.setSub_title("Kuaikan&QianTangTang&FangChao");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10263_1554108800.5357.jpg");
        webtoonData.setTitle("???????????????");
        webtoonData.setSub_title("?????????&?????????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10677_1626345325.6626.jpg");
        webtoonData.setTitle("????????????");
        webtoonData.setSub_title("??????&??????");
        webtoonDataArrayList.add(webtoonData);

        webtoonData = new WebtoonData();
        webtoonData.setImg("https://shtosebzjw.akamaized.net/assets/upfile/co_thumb10/10586_1614672726.6537.jpg");
        webtoonData.setTitle("??????????????? ??????");
        webtoonData.setSub_title("??????");
        webtoonDataArrayList.add(webtoonData);

        coinRecycleAdapter = new WebtoonRecyclerViewAdapter2(webtoonDataArrayList, getContext());
        coinRecycle.setAdapter(coinRecycleAdapter);
    }
}