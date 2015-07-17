package com.zhangyihao.hellomoon.fragment;

import com.zhangyihao.hellomoon.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class HellomoonFragament extends Fragment {

	private Button mPlayButton;
	private Button mStopButton;
	private AudioPlayer mPlayer = new AudioPlayer();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_hello_moon, container, false);
		
		mPlayButton = (Button)view.findViewById(R.id.hellomoon_playButton);
		mStopButton = (Button)view.findViewById(R.id.hellomoon_stopButton);
		
		mPlayButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mPlayer.play(getActivity());
			}
		});
		mStopButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mPlayer.stop();
			}
		});
		
		return view;
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
		mPlayer.stop();
	}
	
	
}
