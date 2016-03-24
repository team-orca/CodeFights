package deneme.codethebank.com.bank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
    final String idE = "Enes Günday";
    final String idO= "Ozan Onur Tek";
    private String coming="";
    private TextView username,userid, textAltın;
    private ImageView imagePara;
    Kuyumcu yeniKuyumcu = new Kuyumcu();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textAltın  = (TextView)findViewById(R.id.altınView);

        textAltın.setText(yeniKuyumcu.AltınınStringKarsılıgı());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, yeniKuyumcu.tlKarşılıgıNedir(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent gelen_intent = getIntent();

        coming = gelen_intent.getStringExtra("id");
        Toast.makeText(getBaseContext(),coming,Toast.LENGTH_LONG).show();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View header = navigationView.getHeaderView(0);
        username= (TextView)header.findViewById(R.id.drawer_username);
        userid= (TextView)header.findViewById(R.id.drawer_userid);
        username.setText("a");
        userid.setText(coming);
        if(coming.equals("12345")){
            username.setText(idO);
        }
        if(coming.equals("123456"))
            username.setText(idE);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.haritaImageButton:
                Toast.makeText(getBaseContext(),"harita",Toast.LENGTH_SHORT).show();
                yeniKuyumcu.yeniAltınMiktarı(0.0);
               textAltın.setText(yeniKuyumcu.AltınınStringKarsılıgı());
                break;
            case R.id.kimlerImageButton:
                Toast.makeText(getBaseContext(),"kimler",Toast.LENGTH_SHORT).show();
                attemptVideo();
                break;
            case R.id.profilImageButton:
                Toast.makeText(getBaseContext(),"profil",Toast.LENGTH_SHORT).show();
                yeniKuyumcu.altınlarıArttır(20.0);
                textAltın.setText(yeniKuyumcu.AltınınStringKarsılıgı());
                break;
            case R.id.ayarlarImageButton:
                Toast.makeText(getBaseContext(),"ayarlar",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void attemptVideo(){

    }
}
