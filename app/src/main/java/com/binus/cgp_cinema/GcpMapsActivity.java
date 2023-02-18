package com.binus.cgp_cinema;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.binus.cgp_cinema.model.Location;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.binus.cgp_cinema.databinding.ActivityGcpMapsBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GcpMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityGcpMapsBinding binding;
    private List<Location> locations = new ArrayList<Location>(){{
        add(new Location("CGP Alpha",-6.193924061113853, 106.78813220277623));
        add(new Location("CGP Beta",-6.20175020412279, 106.78223868546155));
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGcpMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        List<MarkerOptions> markerList = initMarker();

        markerList.forEach(markerOptions -> {
            mMap.addMarker(markerOptions);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerOptions.getPosition(),15));
        });

    }

    private List<MarkerOptions> initMarker(){
        List<MarkerOptions> list = new ArrayList<>();

        locations.forEach(location -> {
            MarkerOptions markerOptions = new MarkerOptions();
            LatLng latLng = new LatLng(location.getLatitude(),location.getLongitude());
            markerOptions.position(latLng);
            markerOptions.title(location.getName());
            list.add(markerOptions);

        });
        return list;
    }
}