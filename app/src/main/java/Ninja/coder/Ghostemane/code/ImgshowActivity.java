package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.*;
import androidx.recyclerview.selection.*;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.webkit.*;
import arabware.file.*;
import com.allenliu.badgeview.*;
import com.android.tools.r8.*;
import com.bumptech.glide.*;
import com.bumptech.glide.integration.avif.*;
import com.bumptech.glide.integration.recyclerview.*;
import com.caverock.androidsvg.*;
import com.github.angads25.filepicker.*;
import com.github.junrar.*;
import com.google.android.material.*;
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.skydoves.powermenu.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import meorg.jsoup.*;
import org.antlr.v4.runtime.*;
import org.benf.cfr.reader.*;
import org.beyka.tiffbitmapfactory.*;
import org.json.*;
import storage.sdcard.*;
import xyz.doikki.videoplayer.*;
import xyz.doikki.videoplayer.exo.*;
import xyz.doikki.videoplayer.ijk.*;

public class ImgshowActivity extends BaseCompat {
	
	private double Token = 0;
	private String post = "";
	private String IMAGE_VIEWER_PATH = "";
	private double imageFilesPosition = 0;
	private double imageViewPosition = 0;
	
	private ArrayList<HashMap<String, Object>> viewerListMap = new ArrayList<>();
	
	private PraramnetLayoutNinja linear2;
	private LinearLayout linear1;
	private ViewPager viewpager1;
	private TextView textview1;
	private ImageView imageview1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.imgshow);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear2 = findViewById(R.id.linear2);
		linear1 = findViewById(R.id.linear1);
		viewpager1 = findViewById(R.id.viewpager1);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		
		viewpager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int _position, float _positionOffset, int _positionOffsetPixels) {
				
			}
			
			@Override
			public void onPageSelected(int _position) {
				textview1.setText("ImageViews ( ".concat(Uri.parse(viewerListMap.get((int)_position).get("path").toString()).getLastPathSegment().concat(" )")));
			}
			
			@Override
			public void onPageScrollStateChanged(int _scrollState) {
				
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
	}
	
	private void initializeLogic() {
		_refreshViewer(getIntent().getStringExtra("imagePath"));
		imageViewPosition = 0;
		for(int _repeat33 = 0; _repeat33 < (int)(viewerListMap.size()); _repeat33++) {
			if (viewerListMap.get((int)imageViewPosition).containsKey("path")) {
				if (Uri.parse(viewerListMap.get((int)imageViewPosition).get("path").toString()).getLastPathSegment().equals(getIntent().getStringExtra("imageName"))) {
					viewpager1.setCurrentItem((int)imageViewPosition);
					break;
				}
			}
			imageViewPosition++;
		}
		textview1.setText(getIntent().getStringExtra("imageName"));
	}
	
	public void _gogo(final String _input, final ImageView _img, final TextView _tv) {
		try{
			SvgShow.GetFileSvg(_input,_img,this,_tv);
		}catch(Exception e){
			 
		}
	}
	
	
	public boolean _imageFileType(final String _path) {
		return (_path.endsWith(".jpg") || (_path.endsWith(".jpeg") || (_path.endsWith(".svg") || (_path.endsWith(".tiff") || (_path.endsWith(".png") || (_path.endsWith(".tif") || (_path.endsWith(".bmp") || (_path.endsWith(".gif") || (_path.endsWith(".webp") || _path.endsWith(".bmp"))))))))));
	}
	
	
	public void _refreshViewer(final String _path) {
		viewerListMap.clear();
		IMAGE_VIEWER_PATH = _path;
		final File file = new File(IMAGE_VIEWER_PATH);
		final File[] files = file.listFiles();
		Arrays.sort(files, new FileComparator());
		imageFilesPosition = 0;
		for(int _repeat15 = 0; _repeat15 < (int)(files.length); _repeat15++) {
			if (_imageFileType(files[(int)imageFilesPosition].getAbsolutePath())) {
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("path", files[(int)imageFilesPosition].getAbsolutePath());
					viewerListMap.add(_item);
				}
				
			}
			imageFilesPosition++;
		}
		viewpager1.setAdapter(new Viewpager1Adapter(viewerListMap));
		((PagerAdapter)viewpager1.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _sortFilesLibrary() {
	}
	
	public class FileComparator implements Comparator<File> {
			    @Override
			    public int compare(File lhs, File rhs) {
					
					        if (lhs.isDirectory() == rhs.isDirectory()) { // Both files are directory OR file, compare by name
							            return lhs.getName().toLowerCase().compareTo(rhs.getName().toLowerCase());
							        } else if (lhs.isDirectory()) { // Directories before files
							            return -1;
							        } else { // rhs must be a directory
							            return 1;
							        }
					    }
	}
	
	{
	}
	
	public class Viewpager1Adapter extends PagerAdapter {
		
		Context _context;
		ArrayList<HashMap<String, Object>> _data;
		
		public Viewpager1Adapter(Context _ctx, ArrayList<HashMap<String, Object>> _arr) {
			_context = _ctx;
			_data = _arr;
		}
		
		public Viewpager1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_context = getApplicationContext();
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public boolean isViewFromObject(View _view, Object _object) {
			return _view == _object;
		}
		
		@Override
		public void destroyItem(ViewGroup _container, int _position, Object _object) {
			_container.removeView((View) _object);
		}
		
		@Override
		public int getItemPosition(Object _object) {
			return super.getItemPosition(_object);
		}
		
		@Override
		public CharSequence getPageTitle(int pos) {
			// Use the Activity Event (onTabLayoutNewTabAdded) in order to use this method
			return "page " + String.valueOf(pos);
		}
		
		@Override
		public Object instantiateItem(ViewGroup _container,  final int _position) {
			View _view = LayoutInflater.from(_context).inflate(R.layout.show, _container, false);
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			if (viewerListMap.get((int)_position).containsKey("path")) {
				if (viewerListMap.get((int)_position).get("path").toString().endsWith(".svg")) {
					_gogo(viewerListMap.get((int)_position).get("path").toString(), imageview1, textview1);
				}
				else {
					if (viewerListMap.get((int)_position).get("path").toString().endsWith(".tif") || viewerListMap.get((int)_position).get("path").toString().endsWith(".tif")) {
						Bitmap bitmap = org.beyka.tiffbitmapfactory.TiffBitmapFactory.decodePath(viewerListMap.get((int)_position).get("path").toString());
						final GradientDrawable gradientDrawable = new GradientDrawable();
								gradientDrawable.setColor(0xFF1F1B1C);
								gradientDrawable.setStroke(1,ColorStateList.valueOf(Color.parseColor("#FFFFB49D")));
								gradientDrawable.setCornerRadius(20);
								Glide.with(getApplicationContext())
										.load(bitmap)
										.placeholder(gradientDrawable)
										.error(gradientDrawable)
										.into(imageview1);
						
					}
					else {
						imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(viewerListMap.get((int)_position).get("path").toString(), 1024, 1024));
					}
				}
			}
			
			_container.addView(_view);
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}