package cn.dennishucd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FFmpeg4AndroidActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		
		TextView tv = (TextView)this.findViewById(R.id.textview_hello);
		
		FFmpegNative ffmpeg = new FFmpegNative();
		int codecID = 28;
		
		int res = ffmpeg.avcodec_find_decoder(codecID);
		
		if (res ==0) {
			tv.setText("Success!");
		}
		else {
			tv.setText("Failed!");
		}
	}
}
