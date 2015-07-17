package com.zhangyihao.hellomoon.fragment;

import com.zhangyihao.hellomoon.R;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class AudioPlayer {
	private MediaPlayer mPlayer;
	
	public void stop() {
		if(mPlayer!=null) {
			mPlayer.release();
			mPlayer = null;
		}
	}
	
	public void play(Context context) {
		stop();
		mPlayer = MediaPlayer.create(context, R.raw.one_small_step);
		mPlayer.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				stop();
			}
		});
		mPlayer.start();
	}
}
