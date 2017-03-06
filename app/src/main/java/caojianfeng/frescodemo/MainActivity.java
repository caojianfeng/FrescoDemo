package caojianfeng.frescodemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        initData();
    }


    private static final String IMGS[] = {
            "http://p1.bqimg.com/565547/b2c097e0a42d78e7.jpg",
            "http://p1.bqimg.com/565547/8b91660c2c8c9f7d.jpg",
            "http://p1.bqimg.com/565547/cee043d2fb5208c7.jpg",
            "http://p1.bqimg.com/565547/86fe1bcb94a514c4.jpg",
            "http://p1.bqimg.com/565547/238c29f60812341c.jpg",
            "http://p1.bqimg.com/565547/49009cc42b0d6c0a.jpg",
            "http://p1.bqimg.com/565547/17f02892d5ad450c.jpg",
            "http://p1.bqimg.com/565547/62836a4fc0eaafdb.jpg",
            "http://p1.bqimg.com/565547/1fc999aa777937fe.jpg",
            "http://p1.bqimg.com/565547/90a5ec8617ed5d4c.jpg",
            "http://p1.bqimg.com/565547/fa5c207e7cc9d373.jpg",
            "http://p1.bqimg.com/565547/2a469a2e56cd1e41.jpg",
            "http://p1.bqimg.com/565547/48f6dbd66457067f.jpg",
            "http://p1.bqimg.com/565547/632cae4df347c13b.jpg",
            "http://p1.bqimg.com/565547/96d2cf20ce33358e.jpg",
            "http://p1.bqimg.com/565547/6494c820662f8b8e.jpg",
            "http://p1.bqimg.com/565547/ae227ff49d5fff34.jpg",
            "http://p1.bqimg.com/565547/9aaa558f94ac666c.jpg",
            "http://p1.bqimg.com/565547/c32d0b13285551af.jpg",
            "http://p1.bqimg.com/565547/8c57199e87a6a5e0.jpg",
            "http://p1.bqimg.com/565547/43e33a8f160bfbc7.jpg",
            "http://p1.bqimg.com/565547/9db52dcda940d37c.jpg",
            "http://p1.bqimg.com/565547/6b7f3c1b250cc79b.jpg",
            "http://p1.bqimg.com/565547/7d711a083548e131.jpg",
            "http://p1.bqimg.com/565547/0e8f3cf975a2f461.jpg",
            "http://p1.bqimg.com/565547/626ba43c9e7ee349.jpg",
            "http://p1.bqimg.com/565547/ee3394877b8ce5f6.jpg",
            "http://p1.bqimg.com/565547/10130226f421b3de.jpg",
            "http://p1.bqimg.com/565547/9f59e5fabfce7de8.jpg",
            "http://p1.bqimg.com/565547/cebf07665c07b228.jpg",
            "http://i1.piimg.com/565547/7b65bfe24fc62e98.jpg",
            "http://i1.piimg.com/565547/95772b21cb0e950c.jpg",
            "http://i1.piimg.com/565547/680063102458b06a.jpg",
            "http://i1.piimg.com/565547/ecf5c811fb1edf26.jpg",
            "http://i1.piimg.com/565547/1907cfec1dc72e9f.jpg",
            "http://i1.piimg.com/565547/3d6879284b696148.jpg",
            "http://i1.piimg.com/565547/8fba70df23978515.jpg",
            "http://i1.piimg.com/565547/03b15fbe2554d078.jpg",
            "http://i1.piimg.com/565547/72568d54eefae17c.jpg",
            "http://i1.piimg.com/565547/45f8db5e1040be63.jpg",
            "http://i1.piimg.com/565547/a1049b5f731569e6.jpg",
            "http://i1.piimg.com/565547/660c8cd0a01f3333.jpg",
            "http://i1.piimg.com/565547/7189ee6741ff593b.jpg",
            "http://i1.piimg.com/565547/a856f2229a8657d8.jpg",
            "http://i1.piimg.com/565547/6a75cf9b7fe422ca.jpg",
            "http://i1.piimg.com/565547/ee5eec87602250db.jpg",
            "http://i1.piimg.com/565547/73a4752b2e40106f.jpg",
            "http://i1.piimg.com/565547/e608b395a4b47286.jpg",
            "http://i1.piimg.com/565547/3985378395fd21ec.jpg",
            "http://i1.piimg.com/565547/1c2fdfbbfa7da0fe.jpg",
            "http://i1.piimg.com/565547/bb9ad1ce5e397cc0.jpg",
            "http://i1.piimg.com/565547/9aa25562b7ec1d57.jpg",
            "http://i1.piimg.com/565547/a12916f904177576.jpg",
            "http://i1.piimg.com/565547/3c888d35d604fd7f.jpg",
            "http://i1.piimg.com/565547/304d1fa3ff4e5abe.jpg",
            "http://i1.piimg.com/565547/0c2e38bc1d0dd333.jpg",
            "http://i1.piimg.com/565547/c1f66e3e3c9fa406.jpg",
            "http://i1.piimg.com/565547/4025ec5a25873b18.jpg",
            "http://i1.piimg.com/565547/8cb795a47be5ad45.jpg",
            "http://i1.piimg.com/565547/9056cfd200ec70ff.jpg"};

    private void initData() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutMan = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutMan);
        mRecyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                ImgViewHolder holder = new ImgViewHolder(LayoutInflater.from(
                        MainActivity.this).inflate(R.layout.item, parent,
                        false));
                return holder;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                if(holder instanceof ImgViewHolder){
                    ImgViewHolder imgViewHolder = (ImgViewHolder)holder;
                    imgViewHolder.draweeView.setImageURI(IMGS[position]);
                }
            }

            @Override
            public int getItemCount() {
                return IMGS.length;
            }

            class ImgViewHolder extends RecyclerView.ViewHolder {

                SimpleDraweeView draweeView;

                public ImgViewHolder(View view) {
                    super(view);
                    draweeView = (SimpleDraweeView) view.findViewById(R.id.dv);
                }
            }
        });
        mRecyclerView.getAdapter().notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
