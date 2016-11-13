package com.example.raj.iot;


import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import javax.xml.transform.URIResolver;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment  {

    VideoView videoView;
    View view;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "Videos!", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        videoView = (VideoView) getActivity().findViewById(R.id.videoView);
        String VideoPath = "android.resource://com.example.raj.iot/" +R.raw.video ;
        Uri uri = Uri.parse(VideoPath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }


}
