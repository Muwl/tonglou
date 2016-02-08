package cn.yunluosoft.tonglou.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import cn.yunluosoft.tonglou.R;
import cn.yunluosoft.tonglou.adapter.UsedAdapter;

/**
 * Created by Administrator on 2016/2/7.
 */
public class PPActivity extends BaseActivity implements View.OnClickListener {

    private ImageView back;

    private TextView rig;

    private RadioGroup group;

    private RadioButton assign;

    private RadioButton buy;

    private View serch;

    private ListView listView;

    private View pro;

    private UsedAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pp);
        initView();
    }

    private void initView() {
        back= (ImageView) findViewById(R.id.title_back);
        rig= (TextView) findViewById(R.id.title_rig);
        group= (RadioGroup) findViewById(R.id.title_group);
        assign= (RadioButton) findViewById(R.id.title_rb_lef);
        buy= (RadioButton) findViewById(R.id.title_rb_rig);
        serch=findViewById(R.id.pp_serch);
        listView= (ListView) findViewById(R.id.pp_list);
        pro=findViewById(R.id.pp_pro);
        adapter=new UsedAdapter(this);

        back.setOnClickListener(this);
        findViewById(R.id.title_title).setVisibility(View.GONE);
        rig.setVisibility(View.VISIBLE);
        rig.setOnClickListener(this);
        rig.setText("发布");
        assign.setText("拼车");
        buy.setText("求带");
        group.setVisibility(View.VISIBLE);
        serch.setOnClickListener(this);
        adapter=new UsedAdapter(this);
        listView.setAdapter(adapter);

        group.check(R.id.title_rb_lef);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(PPActivity.this,PPDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.title_back:
                finish();
                break;
            case R.id.title_rig:

                break;
            case R.id.pp_serch:

                break;

        }

    }
}