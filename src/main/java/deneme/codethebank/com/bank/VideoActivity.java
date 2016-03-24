package deneme.codethebank.com.bank;


import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;

import android.view.MotionEvent;

import android.view.View;
import android.widget.MediaController;

import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity  {
    private boolean bVideoIsBeingTouched = false;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        tryVideo();


    }
    private void tryVideo() {
        final VideoView vidView = (VideoView)findViewById(R.id.myVideo);
        String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);


        vidView.setMediaController(new MediaController(this));
        vidView.start();
        vidView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoActivity.this, "Video is over", Toast.LENGTH_SHORT).show();

            }
        });
        //controller.hide();
    }




}
