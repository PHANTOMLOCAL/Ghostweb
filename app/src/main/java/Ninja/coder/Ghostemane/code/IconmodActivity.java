package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.*;
import androidx.recyclerview.selection.*;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.*;
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

public class IconmodActivity extends BaseCompat {
	
	private FloatingActionButton _fab;
	private double dos = 0;
	private double length = 0;
	private double d = 0;
	private String serching = "";
	private String hsi = "";
	private String staticString = "";
	private String output = "";
	
	private ArrayList<String> listDir = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> ListMap = new ArrayList<>();
	private ArrayList<String> str2 = new ArrayList<>();
	private ArrayList<String> listStr2 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> mymap = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private TextInputLayout textinputlayout1;
	private EditText edittext1;
	private ProgressBar progressbar1;
	private RecyclerView recyclerview1;
	private RecyclerView recyclerview2;
	
	private  ent;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.iconmod);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
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
		_fab = findViewById(R.id._fab);
		
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		edittext1 = findViewById(R.id.edittext1);
		progressbar1 = findViewById(R.id.progressbar1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		recyclerview2 = findViewById(R.id.recyclerview2);
		
		recyclerview1.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				if (!recyclerview1.canScrollVertically(1)) {
					_fab.hide();
				}
				else {
					_fab.show();
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				recyclerview1.smoothScrollToPosition((int)ListMap.size());
			}
		});
	}
	
	private void initializeLogic() {
		new AsyncTask<String, String, String>() {
			@Override
			protected void onPreExecute() {
				progressbar1.setVisibility(View.VISIBLE);
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_itemList();
					}
				});
				return "";
			}
			@Override
			protected void onPostExecute(String _result) {
				progressbar1.setVisibility(View.GONE);
			}
		}.execute("");
		textinputlayout1.setEndIconVisible(true);
		textinputlayout1.setEndIconDrawable(R.drawable.msearchfileandfolder);
		textinputlayout1.setEndIconOnClickListener(v ->{
						
						recyclerview1.setVisibility(View.GONE);
			_datablindg();
			
				});
	}
	
	public void _itemList() {
		listDir.clear();
		ListMap.clear();
		FileUtil.listDir("/storage/emulated/0/GhostWebIDE/.icon", listDir);
		dos = 0;
		for (int post = 0; post < (int)(listDir.size()); post++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("path", listDir.get((int)(dos)));
				ListMap.add(_item);
			}
			
			dos++;
		}
		recyclerview1.setAdapter(new Recyclerview1Adapter(ListMap));
		recyclerview1.setLayoutManager(new GridLayoutManager (IconmodActivity.this, (int)3));
		
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _datablindg() {
		progressbar1.setVisibility(View.VISIBLE);
		serching = edittext1.getText().toString();
		mymap.clear();
		listDir.clear();
		listStr2.clear();
		
		
		
		
		new Thread(new Runnable() {
			              @Override
			              public void run() {
				 Looper.prepare();
												directoryName = "/storage/emulated/0/GhostWebIDE/.icon";
												listf(directoryName, listDir);
												for(int _repeat12 = 0; _repeat12 < (int)(listDir.size()); _repeat12++) {
															{
																		HashMap<String, Object> _item = new HashMap<>();
																		_item.put("paths", listDir.get((int)(_repeat12)));
																		mymap.add(_item);
															}
					
															
												}
				
				                runOnUiThread(new Runnable() {
					                  @Override
					                  public void run() {
						
																if (!(mymap.size() == 0))	
																	progressbar1.setVisibility(View.GONE);
						recyclerview1.setVisibility(View.GONE);
						recyclerview2.setAdapter(new Recyclerview2Adapter(mymap));
						recyclerview2.setLayoutManager(new GridLayoutManager (IconmodActivity.this, (int)3));
						
						textinputlayout1.setEndIconDrawable(R.drawable.mp400011);
						textinputlayout1.setEndIconOnClickListener(v ->{
										
										listStr2.clear();
							mymap.clear();
							listDir.clear();
							recyclerview2.setVisibility(View.GONE);
							recyclerview1.setVisibility(View.VISIBLE);
							textinputlayout1.setEndIconDrawable(R.drawable.msearchfileandfolder);
							
								});						
														//alerto33.dismiss();
														
						Looper.loop();
														  }
					                });
				              }
			            }).start();
		
		
		 
		
		
		
	}
	public void listf(final String directoryName, final ArrayList<String> listDir) {	              
				
				        java.io.File directory = new java.io.File(directoryName);
				         
				         java.io.File[] fList = directory.listFiles();
				        
				         if(fList != null)
				             for (java.io.File file : fList) {
						                   if (file.isFile() && file.getPath().substring(file.getPath().lastIndexOf("/")+1).toLowerCase().contains(serching)) {
								         listStr2.add(file.getAbsolutePath());                
								         listDir.add(file.getPath().substring(file.getPath().lastIndexOf("/")+1));
								         
								                            } else if (file.isDirectory()) {
								                         listf(file.getPath(), listDir);
								                     }
						               }						                																	         
		          
		     }
	private String directoryName = "";
	private java.io.File directory;
	private java.io.File[] fList;
	private java.io.File file;
	{
	}
	
	
	public void _gogo(final String _input, final ImageView _img, final TextView _tv) {
		try{
			SvgShow.GetFileSvg(_input,_img,this,_tv);
		}catch(Exception e){
			 
		}
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.icon, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			textview2.setText(Uri.parse(_data.get((int)_position).get("path").toString()).getLastPathSegment());
			_gogo(_data.get((int)_position).get("path").toString(), imageview1, textview1);
			textview2.setTextColor(0xFFEEEEEE);
			textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/ghostfont.ttf"), 0);
			textview2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
			textview2.setMarqueeRepeatLimit(-1);
			textview2.setSingleLine(true);
			textview2.setSelected(true);
			
			imageview1.setColorFilter(0xFFFCB07D, PorterDuff.Mode.SRC_IN);
			
			imageview1.setColorFilter(0xFFFCB07D, PorterDuff.Mode.SRC_IN);
			imageview1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(IconmodActivity.this)
					
					    .setView(R.layout.dialogiconimageview)
					.setTitle("iconView")
					.setMessage("svg image Show")
					.setCancelable(true)
					.setPositiveButton("Convert", null)
					.setNegativeButton(android.R.string.cancel, null)
					.create();
					dialog.setOnShowListener((var) -> {
						
						       ImageView img = dialog.findViewById(R.id.img);		
						
						TextView tv = dialog.findViewById(R.id.tv);		
						
						Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
						_gogo(_data.get((int)_position).get("path").toString(), img, tv);
						
						img.setColorFilter(0xFFFCB07D, PorterDuff.Mode.SRC_IN);
						positive.setOnClickListener((vftrororocjj) -> {
							
							             ent = new PowerMenu.Builder(IconmodActivity.this)
							.addItem(new PowerMenuItem("install to project"))
							.addItem(new PowerMenuItem("convert to xml"))
							.build();//   my telegram channel sketchware95
							ent.showAsDropDown(positive);
							ent.setAnimation(MenuAnimation.FADE);//   my telegram channel sketchware95
							ent.setShowBackground(false);
							ent.setMenuColor(0xFF2B2121);
							ent.setSelectedMenuColor(0xFFF59271);
							ent.setSelectedEffect(true);//   my telegram channel sketchware95
							ent.setTextColor(0xFFE0E0E0);//   my telegram channel sketchware95
							ent.setSelectedTextColor(0xFFFDA893);
							ent.setCircularEffect(CircularEffect.INNER);//   my telegram channel sketchware95
							ent.setAutoDismiss(true);
							ent.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>(){
								   @Override
								     public void onItemClick(int position, PowerMenuItem item){
									          switch((int)position) {
										case ((int)0): {
											if (!FileUtil.isDirectory("/sdcard/ghostweb/icon/svg")) {
												FileUtil.makeDir("/sdcard/ghostweb/icon/svg");
											}
											new AsyncTask<String, String, String>() {
												@Override
												protected void onPreExecute() {
													progressbar1.setVisibility(View.VISIBLE);
												}
												@Override
												protected String doInBackground(String... params) {
													String _param = params[0];
													runOnUiThread(new Runnable() {
														@Override
														public void run() {
															FileUtil.copyFile(_data.get((int)_position).get("path").toString(), "sdcard/ghostweb/icon/svg/".concat(Uri.parse(_data.get((int)_position).get("path").toString()).getLastPathSegment()));
														}
													});
													return "";
												}
												@Override
												protected void onPostExecute(String _result) {
													progressbar1.setVisibility(View.GONE);
													SketchwareUtil.showMessage(getApplicationContext(), "saved : ".concat(_data.get((int)_position).get("path").toString()));
													dialog.dismiss();
												}
											}.execute("");
											break;
										}
										case ((int)1): {
											output = "/sdcard/ghostweb/icon/vector/";
											FileUtil.makeDir(output);
											staticString = _data.get((int)_position).get("path").toString();
											vb.iconPath = staticString;
											vb.projectResourceDirectory = output;
											vb.v(IconmodActivity.this);
											
											dialog.dismiss();
											break;
										}
									}
								}
							});//   my telegram channel sketchware95
											
									});
					});
					dialog.show();
				}
			});
			_clickAnimation(linear2);
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)10);
			cardview1.setCardElevation((float)0);
			cardview1.setUseCompatPadding(true);
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
	
	public class Recyclerview2Adapter extends RecyclerView.Adapter<Recyclerview2Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.icon2, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			textview2.setText(Uri.parse(_data.get((int)_position).get("paths").toString()).getLastPathSegment());
			_gogo(_data.get((int)_position).get("paths").toString(), imageview1, textview1);
			textview2.setTextColor(0xFFEEEEEE);
			textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/ghostfont.ttf"), 0);
			textview2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
			textview2.setMarqueeRepeatLimit(-1);
			textview2.setSingleLine(true);
			textview2.setSelected(true);
			
			imageview1.setColorFilter(0xFFFCB07D, PorterDuff.Mode.SRC_IN);
			
			imageview1.setColorFilter(0xFFFCB07D, PorterDuff.Mode.SRC_IN);
			imageview1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(IconmodActivity.this)
					
					    .setView(R.layout.dialogiconimageview)
					.setTitle("iconView")
					.setMessage("svg image Show")
					.setCancelable(true)
					.setPositiveButton("Convert", null)
					.setNegativeButton(android.R.string.cancel, null)
					.create();
					dialog.setOnShowListener((var) -> {
						
						       ImageView img = dialog.findViewById(R.id.img);		
						
						TextView tv = dialog.findViewById(R.id.tv);		
						
						Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
						_gogo(_data.get((int)_position).get("paths").toString(), img, tv);
						
						img.setColorFilter(0xFFFCB07D, PorterDuff.Mode.SRC_IN);
						positive.setOnClickListener((vftrororocjj) -> {
							
							             ent = new PowerMenu.Builder(IconmodActivity.this)
							.addItem(new PowerMenuItem("install to project"))
							.addItem(new PowerMenuItem("convert to xml"))
							.build();//   my telegram channel sketchware95
							ent.showAsDropDown(positive);
							ent.setAnimation(MenuAnimation.FADE);//   my telegram channel sketchware95
							ent.setShowBackground(false);
							ent.setMenuColor(0xFF2B2121);
							ent.setSelectedMenuColor(0xFFF59271);
							ent.setSelectedEffect(true);//   my telegram channel sketchware95
							ent.setTextColor(0xFFE0E0E0);//   my telegram channel sketchware95
							ent.setSelectedTextColor(0xFFFDA893);
							ent.setCircularEffect(CircularEffect.INNER);//   my telegram channel sketchware95
							ent.setAutoDismiss(true);
							ent.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>(){
								   @Override
								     public void onItemClick(int position, PowerMenuItem item){
									          switch((int)position) {
										case ((int)0): {
											if (!FileUtil.isDirectory("/sdcard/ghostweb/icon/svg")) {
												FileUtil.makeDir("/sdcard/ghostweb/icon/svg");
											}
											new AsyncTask<String, String, String>() {
												@Override
												protected void onPreExecute() {
													progressbar1.setVisibility(View.VISIBLE);
												}
												@Override
												protected String doInBackground(String... params) {
													String _param = params[0];
													runOnUiThread(new Runnable() {
														@Override
														public void run() {
															FileUtil.copyFile(_data.get((int)_position).get("paths").toString(), "sdcard/ghostweb/icon/svg/".concat(Uri.parse(_data.get((int)_position).get("path").toString()).getLastPathSegment()));
														}
													});
													return "";
												}
												@Override
												protected void onPostExecute(String _result) {
													progressbar1.setVisibility(View.GONE);
													SketchwareUtil.showMessage(getApplicationContext(), "saved : ".concat(_data.get((int)_position).get("paths").toString()));
													dialog.dismiss();
												}
											}.execute("");
											break;
										}
										case ((int)1): {
											SketchwareUtil.showMessage(getApplicationContext(), "soon");
											dialog.dismiss();
											break;
										}
									}
								}
							});//   my telegram channel sketchware95
											
									});
					});
					dialog.show();
				}
			});
			_clickAnimation(linear2);
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)10);
			cardview1.setCardElevation((float)0);
			cardview1.setUseCompatPadding(true);
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
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