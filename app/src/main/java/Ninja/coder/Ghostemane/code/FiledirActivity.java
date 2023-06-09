package Ninja.coder.Ghostemane.code;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.media.MediaPlayer;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
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
import com.bumptech.glide.Glide;
import com.bumptech.glide.integration.avif.*;
import com.bumptech.glide.integration.recyclerview.*;
import com.caverock.androidsvg.*;
import com.github.angads25.filepicker.*;
import com.github.junrar.*;
import com.google.android.material.*;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.skydoves.powermenu.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
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
import com.caverock.androidsvg.SVGImageView;
import android.widget.LinearLayout.LayoutParams;
import io.github.rosemoe.sora.widget.*;
import java.security.*;
import com.github.angads25.filepicker.view.*;
import com.github.angads25.filepicker.model.*;
import com.github.angads25.filepicker.controller.*;
import com.github.angads25.filepicker.utils.*;
import com.github.angads25.filepicker.widget.*;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputLayout;
import com.zip4j.progress.ProgressMonitor;
import java.io.FileOutputStream;
import java.io.IOException;
import android.app.ProgressDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
import java.io.File;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.util.zip.ZipOutputStream;
import org.beyka.tiffbitmapfactory.CompressionScheme;
import org.beyka.tiffbitmapfactory.IProgressListener;
import org.beyka.tiffbitmapfactory.TiffBitmapFactory;
import org.beyka.tiffbitmapfactory.TiffConverter;
import a.a.a.bB;
import mod.hey.studios.project.library.LibraryDownloader;
import mod.hey.studios.util.Helper;
import android.view.inputmethod.InputMethodManager;
import com.sdsmdg.harjot.vectormaster.VectorMasterDrawable;

public class FiledirActivity extends BaseCompat {
	
	private Timer _timer = new Timer();
	
	private SdCardUtil sd_stor;
	private ProgressMonitor progress_m;
	private ProgressDialog progressDialog;
	private androidx.appcompat.app.AlertDialog maindialogPrfex;
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private double index = 0;
	private String Folder = "";
	private String Token = "";
	private String staticstring = "";
	private double gotoback = 0;
	private String UpFolder = "";
	private String CreateFolder = "";
	private String mainfile = "";
	private String GetTab = "";
	private String tab = "";
	private double n = 0;
	private double positionTabs = 0;
	private HashMap<String, Object> styles = new HashMap<>();
	private double staitman = 0;
	private String GetAndroidjar = "";
	private String Ghost = "";
	private boolean Chack = false;
	private double NumberFake = 0;
	private boolean isCopyAndMoved = false;
	private double pos = 0;
	private double conter = 0;
	private boolean isAllSet = false;
	private boolean staticStorage = false;
	private String o01 = "";
	private double web = 0;
	private String projectPath = "";
	private String result = "";
	private boolean gv = false;
	private String proh = "";
	private String strInp = "";
	private String vrw = "";
	private String fb = "";
	private String doc = "";
	private String version = "";
	private double post = 0;
	private String arm = "";
	private double newpos = 0;
	private String path = "";
	private String output = "";
	private double position = 0;
	private String onBindVector = "";
	
	private ArrayList<String> list = new ArrayList<>();
	private ArrayList<String> folderList = new ArrayList<>();
	private ArrayList<String> fileList = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> files = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> mytab = new ArrayList<>();
	private ArrayList<String> mylist = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> newlistmap = new ArrayList<>();
	private ArrayList<String> args = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> treeviewmap = new ArrayList<>();
	private ArrayList<String> pv = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> test = new ArrayList<>();
	private ArrayList<String> copyOrMove = new ArrayList<>();
	private ArrayList<String> zip = new ArrayList<>();
	private ArrayList<String> listStringShareFile = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> hsi = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> upfile = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	private ArrayList<String> str1 = new ArrayList<>();
	private ArrayList<String> str2 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> projectdata = new ArrayList<>();
	private ArrayList<Double> cache = new ArrayList<>();
	
	private PraramnetLayoutNinja linear1;
	private LinearLayout CensractorListView1;
	private LinearLayout ItemsPrtecalViews;
	private LinearLayout linear4;
	private GridView gridview1;
	private LinearLayout postTask;
	private RecyclerView recyclerview2;
	private LinearLayout Calciolater;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private TextView textview2;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private TextView getItems;
	private MaterialCheckBox checkbox2;
	private ImageView imageview1;
	private RecyclerView recyclerview1;
	private ProgressBar progressbar1;
	private TextView textview3;
	private ImageView imageview2;
	private TextView textview1;
	private LinearLayout linearDis;
	private LinearLayout linear10;
	private Button makeproject;
	private Button copy;
	private Button del1;
	private Button ra;
	private Button cansel;
	private Button setupRanmeFile;
	private Button cuts;
	private LinearLayout _drawer_mcardtest;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_getColor;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear5;
	private ImageView _drawer_imageview1;
	private TextView _drawer_textview7;
	private LinearLayout _drawer_theme;
	private ListView _drawer_mlist;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview2;
	
	private Intent myintent = new Intent();
	private Intent myketint = new Intent();
	private Intent intgetTheme = new Intent();
	private Intent intentgetSettings = new Intent();
	private SharedPreferences shp;
	private Intent activitiy = new Intent();
	private ProgressDialog progressDilaog;
	private ProgressDialog unzip;
	private Calendar mCalender = Calendar.getInstance();
	private AlertDialog.Builder alterDialogDel;
	private AlertDialog.Builder AlterDialogRname;
	private SharedPreferences soglo;
	private AlertDialog.Builder DialogCopyM;
	private SharedPreferences np;
	private ProgressDialog mprodialog;
	private SharedPreferences dismoveFile;
	private AlertDialog.Builder alterDicompiler;
	private ProgressDialog prodel;
	private ProgressDialog proveg;
	private Intent getabout = new Intent();
	private Intent void10 = new Intent();
	private SharedPreferences sd;
	private SharedPreferences delfile;
	private TimerTask t;
	private ProgressDialog copydir;
	private ProgressDialog copypath;
	private MediaPlayer m;
	private TimerTask vvv12;
	private Intent getJavaLayoutManager = new Intent();
	private  dialogLisnterRanmeFileandFolder;
	private SharedPreferences zipCuntishen;
	private ProgressDialog unzipProject;
	private Intent govirwFilm = new Intent();
	private TimerTask ask;
	private  GhostwebApk;
	private ProgressDialog taskruning;
	private SharedPreferences war;
	private RequestNetwork AppUpdeat;
	private RequestNetwork.RequestListener _AppUpdeat_request_listener;
	private Intent finalintentpostfont = new Intent();
	private Intent intentgetLogCat = new Intent();
	private SharedPreferences tmp;
	private  mmenuitempos;
	private  mmenuVector;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.filedir);
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
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(FiledirActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		CensractorListView1 = findViewById(R.id.CensractorListView1);
		ItemsPrtecalViews = findViewById(R.id.ItemsPrtecalViews);
		linear4 = findViewById(R.id.linear4);
		gridview1 = findViewById(R.id.gridview1);
		postTask = findViewById(R.id.postTask);
		recyclerview2 = findViewById(R.id.recyclerview2);
		Calciolater = findViewById(R.id.Calciolater);
		linear7 = findViewById(R.id.linear7);
		linear6 = findViewById(R.id.linear6);
		textview2 = findViewById(R.id.textview2);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		getItems = findViewById(R.id.getItems);
		checkbox2 = findViewById(R.id.checkbox2);
		imageview1 = findViewById(R.id.imageview1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		progressbar1 = findViewById(R.id.progressbar1);
		textview3 = findViewById(R.id.textview3);
		imageview2 = findViewById(R.id.imageview2);
		textview1 = findViewById(R.id.textview1);
		linearDis = findViewById(R.id.linearDis);
		linear10 = findViewById(R.id.linear10);
		makeproject = findViewById(R.id.makeproject);
		copy = findViewById(R.id.copy);
		del1 = findViewById(R.id.del1);
		ra = findViewById(R.id.ra);
		cansel = findViewById(R.id.cansel);
		setupRanmeFile = findViewById(R.id.setupRanmeFile);
		cuts = findViewById(R.id.cuts);
		_drawer_mcardtest = _nav_view.findViewById(R.id.mcardtest);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_getColor = _nav_view.findViewById(R.id.getColor);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_textview7 = _nav_view.findViewById(R.id.textview7);
		_drawer_theme = _nav_view.findViewById(R.id.theme);
		_drawer_mlist = _nav_view.findViewById(R.id.mlist);
		_drawer_imageview3 = _nav_view.findViewById(R.id.imageview3);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		shp = getSharedPreferences("shp", Activity.MODE_PRIVATE);
		alterDialogDel = new AlertDialog.Builder(this);
		AlterDialogRname = new AlertDialog.Builder(this);
		soglo = getSharedPreferences("soglo", Activity.MODE_PRIVATE);
		DialogCopyM = new AlertDialog.Builder(this);
		np = getSharedPreferences("np", Activity.MODE_PRIVATE);
		dismoveFile = getSharedPreferences("DismoveFile", Activity.MODE_PRIVATE);
		alterDicompiler = new AlertDialog.Builder(this);
		sd = getSharedPreferences("sd", Activity.MODE_PRIVATE);
		delfile = getSharedPreferences("delfile", Activity.MODE_PRIVATE);
		zipCuntishen = getSharedPreferences("zipCuntishen", Activity.MODE_PRIVATE);
		war = getSharedPreferences("war", Activity.MODE_PRIVATE);
		AppUpdeat = new RequestNetwork(this);
		tmp = getSharedPreferences("tmp", Activity.MODE_PRIVATE);
		
		recyclerview2.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				
			}
		});
		
		checkbox2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Chack) {
					if (isAllSet) {
						checkbox2.setChecked(false);
						_selAll(files.size(), "sel", "false", files);
						isAllSet = false;
						getItems.setText("Select ".concat("0"));
						conter = 0;
						recyclerview2.setAdapter(new Recyclerview2Adapter(files));
						recyclerview2.getAdapter().notifyDataSetChanged();
					}
					else {
						checkbox2.setChecked(true);
						_selAll(files.size(), "sel", "true", files);
						isAllSet = true;
						getItems.setText("Select".concat(String.valueOf((long)(conter))));
						conter = index;
						recyclerview2.setAdapter(new Recyclerview2Adapter(files));
						recyclerview2.getAdapter().notifyDataSetChanged();
					}
				}
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Chack = false;
				isCopyAndMoved = false;
				imageview1.setImageResource(R.drawable.folderhome);
				imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				linearDis.setVisibility(View.GONE);
				linear9.setVisibility(View.GONE);
				conter = 0;
				_cleardata();
				_getFiles("");
			}
		});
		
		makeproject.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		copy.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		copy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (conter == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "لطفا ایتم را انتخاب کنید");
				}
				else {
					new AsyncTask<String, String, String>() {
						@Override
						protected void onPreExecute() {
							postTask.setVisibility(View.VISIBLE);
						}
						@Override
						protected String doInBackground(String... params) {
							String _param = params[0];
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_copyfile();
									imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
									linear9.setVisibility(View.GONE);
									Chack = false;
									isCopyAndMoved = false;
									imageview1.setImageResource(R.drawable.folderhome);
								}
							});
							return "";
						}
						@Override
						protected void onPostExecute(String _result) {
							postTask.setVisibility(View.GONE);
						}
					}.execute("");
				}
			}
		});
		
		del1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (conter == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "لطفا ایتیم را مشخص کنید");
				}
				else {
					new AsyncTask<String, String, String>() {
						@Override
						protected void onPreExecute() {
							postTask.setVisibility(View.VISIBLE);
						}
						@Override
						protected String doInBackground(String... params) {
							String _param = params[0];
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									Chack = false;
									isCopyAndMoved = false;
									imageview1.setImageResource(R.drawable.folderhome);
									linear9.setVisibility(View.GONE);
									imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
									_delet();
								}
							});
							return "";
						}
						@Override
						protected void onPostExecute(String _result) {
							postTask.setVisibility(View.GONE);
						}
					}.execute("");
				}
			}
		});
		
		ra.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "در ورژن بعدی ");
			}
		});
		
		cansel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				isCopyAndMoved = false;
				Chack = false;
				copy.setVisibility(View.VISIBLE);
				cuts.setVisibility(View.VISIBLE);
				del1.setVisibility(View.VISIBLE);
				ra.setVisibility(View.VISIBLE);
				setupRanmeFile.setVisibility(View.VISIBLE);
				linear9.setVisibility(View.VISIBLE);
				imageview1.setImageResource(R.drawable.folderhome);
				imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
				recyclerview2.setAdapter(new Recyclerview2Adapter(files));
				recyclerview2.getAdapter().notifyDataSetChanged();
			}
		});
		
		setupRanmeFile.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (conter == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "لطفا فایل را انتخاب کنید");
				}
				else {
					if (zipCuntishen.contains("inzip")) {
						if (zipCuntishen.getString("inzip", "").equals("true")) {
							/* Failed to resolve Custom Block's code: java.util.MissingFormatArgumentException: Format specifier '%11$s' */
							zipCuntishen.edit().remove("gozip").commit();
						}
						else {
							
						}
					}
					else {
						
					}
				}
			}
		});
		
		cuts.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (conter == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "لطفا ایتم را انتخاب کنید");
				}
				else {
					new AsyncTask<String, String, String>() {
						@Override
						protected void onPreExecute() {
							postTask.setVisibility(View.VISIBLE);
						}
						@Override
						protected String doInBackground(String... params) {
							String _param = params[0];
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									_cut();
									Chack = false;
									isCopyAndMoved = false;
									linear9.setVisibility(View.GONE);
									imageview1.setImageResource(R.drawable.folderhome);
									imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
								}
							});
							return "";
						}
						@Override
						protected void onPostExecute(String _result) {
							postTask.setVisibility(View.GONE);
						}
					}.execute("");
				}
			}
		});
		
		_AppUpdeat_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try{
					upfile = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				}catch(Exception e){
					 
				}
				if (!upfile.get((int)0).get("Version").toString().equals(version)) {
					///AddDialog
					var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
					    di.setTitle(upfile.get((int)0).get("Title").toString());
					di.setMessage(upfile.get((int)0).get("Massges").toString());
					di.setCancelable(false);
					di.setNeutralButton("اپدیت", (p, d) -> {
						
						         void10.setAction(Intent.ACTION_VIEW);
						void10.setData(Uri.parse(upfile.get((int)0).get("Link").toString()));
						startActivity(void10);
						finishAffinity();
						
									});
					di.show();
					
					
					
					
				}
				else {
					///Empty
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		
		linear1.setBackgroundColor(0xFF2B2121);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		AppUpdeat.startRequestNetwork(RequestNetworkController.GET, "https://raw.githubusercontent.com/Arashvscode/GhostWebThemes/main/Themes/Roules/Post/Getr/log.json", "", _AppUpdeat_request_listener);
		if (war.contains("val")) {
			Drawable drawable = WallpaperManager.getInstance(FiledirActivity.this).getDrawable();
			if (drawable != null) {
					linear1.setBackgroundDrawable(drawable);
				    _drawer_getColor.setBackgroundDrawable(drawable);
			}
			
		}
		try {
				android.content.pm.PackageInfo pInfo = getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0);
				version = pInfo.versionName;
		} catch (android.content.pm.PackageManager.NameNotFoundException e) {
				showMessage(e.toString());
		}
		
		
		{
			class RandomQR776 {
				public Context c;
				public <T extends android.app.Activity> RandomQR776(T a) {
					c = a;
				}
				public RandomQR776(Context c1) {
					c=c1;
				}
				public <T extends android.app.Fragment> RandomQR776(T a) {
					try {
						c = a.getContext();
					} catch(Exception e) {
						c = a.getActivity();
					}
				}
				
				public <T extends android.app.DialogFragment> RandomQR776(T a) {
					try {
						c = a.getContext();
					} catch(Exception e) {
						c = a.getActivity();
					}
				}
				
				public Context getContext() {
					return c;
					
					
				}
			}
			GhostwebApk = new ApkUtils(new RandomQR776(FiledirActivity.this).getContext());
		}
		var progress_m = new com.zip4j.progress.ProgressMonitor();
		 progressDilaog = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		  unzip = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		  mprodialog = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		  prodel = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		  proveg = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		  copydir = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		  copypath = new ProgressDialog(FiledirActivity.this ,ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		///result code By Ninja coder.ir my love java
		///result code By Ninja coder.ir my love java
		
		
		GradientDrawable u = new GradientDrawable();
				u.setColor(0xFF2B2122);
				u.setCornerRadius(25);
				u.setStroke(1, 0xFFF8B09A);
		_swinit();
		linear1.setLayoutParams(new LinearLayout.LayoutParams(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), SketchwareUtil.getDisplayHeightPixels(getApplicationContext())));
		progressDilaog.getWindow().setBackgroundDrawable(u);
		unzip.getWindow().setBackgroundDrawable(u);
		mprodialog.getWindow().setBackgroundDrawable(u);
		prodel.getWindow().setBackgroundDrawable(u);
		proveg.getWindow().setBackgroundDrawable(u);
		copydir.getWindow().setBackgroundDrawable(u);
		copypath.getWindow().setBackgroundDrawable(u);
		postTask.setVisibility(View.GONE);
		sd_stor = new SdCardUtil(this);
		Folder = FileUtil.getExternalStorageDir();
		_getFiles("");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				Window Hsi = this.getWindow();
				Hsi.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				Hsi.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
				
				Hsi.setStatusBarColor(Color.parseColor("#FF2B2121")); Hsi.setNavigationBarColor(Color.parseColor("#FF2B2121"));
		}
		getSupportActionBar().hide();
		
		var DrawelColors = new GradientDrawable();
		int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
		DrawelColors.setColor(0xFF2B2121);
		DrawelColors.setCornerRadii(new float[]{
				d*0,d*0,d*24 ,d*24,d*24,d*24 ,d*0,d*0});
		_drawer_mcardtest.setElevation(d*5);
		_drawer_mcardtest.setBackground(DrawelColors);
		
		final LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view); _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		_drawer_mlist.setHorizontalScrollBarEnabled(false);
		_drawer_mlist.setVerticalScrollBarEnabled(false);
		_drawer_mlist.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		// youtube channel Hichem Soft
		sharedPreferences = getSharedPreferences("fileSp", Context.MODE_PRIVATE);
		utils = new HichemSoftFileUtil(sharedPreferences, FiledirActivity.this).loadData();
		utils.requestPermissionAllFilesAccess();//if not allowed
		
		
		
		
		if (FileUtil.isExistFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost")) {
				 
		}
		else {
				var materialdialogpost = new MaterialAlertDialogBuilder(FiledirActivity.this);
			materialdialogpost.setTitle("نصب تم ");
			materialdialogpost.setMessage("اخطار ممکن است فایل تم دچار تغییراتی شده باشد از جمله ویرایش دستی تم لطفا تایید کنید که تم اصلی براتون نصب بشود");
			materialdialogpost.setCancelable(false);
			materialdialogpost.setNeutralButton("نصب", (ppo29237292211, drjj202020) -> {
					copyOneFileFromAssets("GhostThemeapp.ghost", "/storage/emulated/0/GhostWebIDE/theme/");
					FileUtil.makeDir("/storage/emulated/0/GhostWebIDE/theme");
			});
			materialdialogpost.show();
			
			
		}
		_refreshTabs();
		if (FileUtil.isExistFile("/storage/emulated/0/GhostWebIDE/android/Android.jar")) {
				 
		}
		else {
				FileUtil.makeDir("/storage/emulated/0/GhostWebIDE/android/");
			new AsyncTask<String, String, String>() {
				@Override
				protected void onPreExecute() {
					progressDilaog.setTitle(Html.fromHtml("<font color=\"#fff3a2\">نصب دیتا</font>"));
					progressDilaog.setMessage(Html.fromHtml("توجه داشته باشید فایل را حذف نکنید مگر نه دوباره این عملیات برای شما تکرار خواهد شد"));
					progressDilaog.setCancelable(false);
					progressDilaog.setCanceledOnTouchOutside(false);
					progressDilaog.show();
				}
				@Override
				protected String doInBackground(String... params) {
					String _param = params[0];
					 
					return "";
				}
				@Override
				protected void onPostExecute(String _result) {
					
					AssetsSoft assetsSoft = new AssetsSoft();
							assetsSoft.unzipFromAssets(FiledirActivity.this,"dontunzip.zip","/storage/emulated/0/GhostWebIDE/android/");
					progressDilaog.dismiss();
				}
			}.execute("");
		}
		if (FileUtil.isExistFile("/storage/emulated/0/GhostWebIDE/.icon/4d.svg")) {
				 
		}
		else {
				FileUtil.makeDir("/storage/emulated/0/GhostWebIDE/.icon");
			new AsyncTask<String, String, String>() {
				@Override
				protected void onPreExecute() {
					progressDilaog.setTitle("نصب ایکون ها");
					progressDilaog.setMessage("در حال نصب ایکون ها بسته به قدرت موبایل شما است ممکن است 10 تا  15 دقیقه طول بکشد صبور باشید...");
					progressDilaog.setCancelable(false);
					progressDilaog.setCanceledOnTouchOutside(false);
					progressDilaog.show();
				}
				@Override
				protected String doInBackground(String... params) {
					String _param = params[0];
					
					AssetsSoft assetsSoft = new AssetsSoft();
							assetsSoft.unzipFromAssets(FiledirActivity.this,"icon.zip","/storage/emulated/0/GhostWebIDE/.icon");
					return "";
				}
				@Override
				protected void onPostExecute(String _result) {
					progressDilaog.dismiss();
				}
			}.execute("");
		}
		Alerter.create(FiledirActivity.this) 
		.setTitle("GhostWeb IDE")
		.setText("Version Used = 1.4.9-Rc1")
		.setBackgroundColorInt(0xFF2B2122)
		.setTitleTypeface(Typeface.createFromAsset(getAssets(), "GhostFont.ttf"))
		.setTextTypeface(Typeface.createFromAsset(getAssets(), "GhostFont.ttf"))
		.show();
		Calciolater.setVisibility(View.GONE);
		linearDis.setVisibility(View.GONE);
		linear9.setVisibility(View.GONE);
		_AllAnimWork(copy);
		_AllAnimWork(cuts);
		_AllAnimWork(del1);
		_AllAnimWork(ra);
		_AllAnimWork(cansel);
		///AddNiceNameFab
		
		final ExtendedFloatingActionButton fabMic,fabAdd,fabCall,fabFile,fabFolder,Fabgits,FabSearchFile,fabproject;
		///Show id Fab 
		fabAdd = findViewById(R.id.fabAdd);
		fabCall = findViewById(R.id.fabCall);
		fabMic = findViewById(R.id.fabMic);
		fabFile = findViewById(R.id.fabFile);
		fabFolder = findViewById(R.id.fabFolder);
		Fabgits = findViewById(R.id.Fabgits);
		FabSearchFile = findViewById(R.id.FabSearchFile);
		fabproject = findViewById(R.id.fabproject);
		AnimUtils.Worker(fabAdd);
		AnimUtils.Worker(fabCall);
		AnimUtils.Worker(fabMic);
		AnimUtils.Worker(fabFile);
		AnimUtils.Worker(fabFolder);
		AnimUtils.Worker(Fabgits);
		AnimUtils.Worker(FabSearchFile);
		AnimUtils.Worker(fabproject);
		fabAdd.setIconResource(R.drawable.plus);
		fabAdd.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		fabAdd.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabAdd.setStrokeWidth(1);
		fabAdd.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabMic.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		fabMic.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabMic.setStrokeWidth(1);
		fabMic.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabCall.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		fabCall.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabCall.setStrokeWidth(1);
		fabCall.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabFile.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		fabFile.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabFile.setStrokeWidth(1);
		fabFile.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabFolder.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		fabFolder.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabFolder.setStrokeWidth(1);
		fabFolder.setIconTint(ColorStateList.valueOf(0xFFFFFFFF));
		fabAdd.shrink();
		fabCall.shrink();
		fabMic.shrink();
		fabFile.shrink();
		fabFolder.shrink();
		Fabgits.shrink();
		Fabgits.setIconResource(R.drawable.github);
		fabMic.setIconResource(R.drawable.project);
		fabCall.setIconResource(R.drawable.opendes);
		fabFolder.setIconResource(R.drawable.folder3);
		fabFile.setIconResource(R.drawable.file);
		Fabgits.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		Fabgits.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		Fabgits.setStrokeWidth(1);
		///Show All Disane Fab
		
		FabSearchFile.setIconResource(R.drawable.textsearch);
		FabSearchFile.shrink();
		FabSearchFile.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		FabSearchFile.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		FabSearchFile.setStrokeWidth(1);
		
		/// new fab mode project linser
		
		fabproject.setIconResource(R.drawable.mimagproject);
		fabproject.shrink();
		fabproject.setBackgroundTintList(ColorStateList.valueOf(0xFF2B2121));
		fabproject.setStrokeColor(ColorStateList.valueOf(0xFFFDA893));
		fabproject.setStrokeWidth(1);
		
		_initShowOut(fabCall);
		_initShowOut(fabMic);
		_initShowOut(fabFile);
		_initShowOut(fabFolder);
		_initShowOut(Fabgits);
		_initShowOut(FabSearchFile);
		_initShowOut(fabproject);
		fabAdd.setOnClickListener(v->{
				
			
				 if (!gv) {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(fabFolder);
				_ShowIn(fabFile);
				_ShowIn(Fabgits);
				_ShowIn(FabSearchFile);
				_ShowIn(fabproject);
			}
			else {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
		});
		fabMic.setOnClickListener(v->{
				
			
				 if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(fabFolder);
				_ShowIn(fabFile);
				_ShowIn(Fabgits);
				_ShowIn(FabSearchFile);
				_ShowIn(fabproject);
			}
			_projectinit();
		});
		fabCall.setOnClickListener(v->{
				
			
				 if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(fabFolder);
				_ShowIn(fabFile);
				_ShowIn(Fabgits); 
				_ShowIn(FabSearchFile);
				_ShowIn(fabproject);
			}
			if (!_drawer.isDrawerOpen(GravityCompat.START)) {
				_drawer.openDrawer(GravityCompat.START);
			}
			else {
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		fabFile.setOnClickListener(v->{
				
			
				 if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				
			}
			_file();
			
		});
		fabFolder.setOnClickListener(v->{
				
			
				 if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(Fabgits);
				_ShowIn(FabSearchFile);
			}
			_folder();
		});
		Fabgits.setOnClickListener(v->{
				
			
				 _installGithub();
			if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(Fabgits);
				_ShowIn(FabSearchFile);
				_ShowIn(fabproject);
			}
		});
		FabSearchFile.setOnClickListener(v->{
				
			
				 if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(Fabgits);
				_ShowIn(FabSearchFile);
				_ShowIn(fabproject);
			}
			_serachfilebeta();
		});
		fabproject.setOnClickListener(v->{
				
			
				 if (gv) {
				gv = false;
				_ShowOut(fabMic);
				_ShowOut(fabCall);
				fabAdd.setIconResource(R.drawable.plus);
				_ShowOut(fabFile);
				_ShowOut(fabFolder);
				_ShowOut(Fabgits);
				_ShowOut(FabSearchFile);
				_ShowOut(fabproject);
			}
			else {
				gv = true;
				_ShowIn(fabMic);
				_ShowIn(fabCall);
				fabAdd.setIconResource(R.drawable.close);
				_ShowIn(Fabgits);
				_ShowIn(FabSearchFile);
				_ShowIn(fabproject);
			}
			_importpojectm();
		});
		_drawer_mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
								if (_position == 0) {
					intentgetSettings.setClass(getApplicationContext(), SettingappActivity.class);
					startActivity(intentgetSettings);
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 1) {
					getJavaLayoutManager.setClass(getApplicationContext(), JavamanagerlayoutActivity.class);
					getJavaLayoutManager.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
					startActivity(getJavaLayoutManager);
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 2) {
					myketint.setAction(Intent.ACTION_VIEW);
					myketint.setData(Uri.parse("myket://comment?id=Ninja.coder.Ghostemane.code"));
					startActivity(myketint);
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 3) {
					void10.setClass(getApplicationContext(), TerminalActivity.class);
					startActivity(void10);
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 4) {
					if (staticStorage) {
						staticStorage = false;
						Folder = FileUtil.getExternalStorageDir();
						SketchwareUtil.showMessage(getApplicationContext(), FileUtil.getExternalStorageDir());
						_getFiles("");
						((BaseAdapter)_drawer_mlist.getAdapter()).notifyDataSetChanged();
						_drawer.closeDrawer(GravityCompat.START);
					}
					else {
						staticStorage = true;
						if (sd_stor.hasRealRemovableSdCarde()) {
							Folder = sd_stor.getExtSdPath();
							SketchwareUtil.showMessage(getApplicationContext(), sd_stor.getExtSdPath());
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "مموری کارت پیدا نشد متاسفم");
						}
						_getFiles("");
						((BaseAdapter)_drawer_mlist.getAdapter()).notifyDataSetChanged();
						_drawer.closeDrawer(GravityCompat.START);
					}
				}
				if (_position == 5) {
					getabout.setClass(getApplicationContext(), AboutActivity.class);
					startActivity(getabout);
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 6) {
					getabout.setClass(getApplicationContext(), LeranActivity.class);
					startActivity(getabout);
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 7) {
					_lojiceinstallK();
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 8) {
					if (SketchwareUtil.isConnected(getApplicationContext())) {
						AppUpdeat.startRequestNetwork(RequestNetworkController.GET, "https://raw.githubusercontent.com/Arashvscode/GhostWebThemes/main/Themes/Roules/Post/Getr/log.json", "v", _AppUpdeat_request_listener);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "اینترنت خاموش است");
						
					}
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 9) {
					mCalender = Calendar.getInstance();
					if (FileUtil.isFile("/storage/emulated/0/GhostWebIDE/theme/theme.AA")) {
						var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
						    di.setTitle("هشدار");
						di.setMessage("این فایل در مسیر شما وجود دارد ایا میخواهید این فایل را جایگزین کنید؟");
						di.setNeutralButton("بله", (p, d) -> {
							
							         try {
								
													new net.lingala.zip4j.ZipFile("/storage/emulated/0/GhostWebIDE/".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(0), (int)(99999)))).concat("theme.AA"))).addFolder(new java.io.File("/storage/emulated/0/GhostWebIDE/theme/"));
								SketchwareUtil.showMessage(getApplicationContext(), "انجام شد در پوشه برنامه");
								
											} catch (net.lingala.zip4j.exception.ZipException e) {
													showMessage(e.toString());
											}
							
										});
						di.setPositiveButton("خیر", (p1, d2) -> {
							
							          
							
										});
						di.show();
						
						
						
						
					}
					else {
						try {
							
												new net.lingala.zip4j.ZipFile("/storage/emulated/0/GhostWebIDE/".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(0), (int)(9999)))).concat("theme.AA"))).addFolder(new java.io.File("/storage/emulated/0/GhostWebIDE/theme/"));
							SketchwareUtil.showMessage(getApplicationContext(), "انجام شد در پوشه برنامه");
							
										} catch (net.lingala.zip4j.exception.ZipException e) {
												showMessage(e.toString());
										}
					}
					_drawer.closeDrawer(GravityCompat.START);
				}
				if (_position == 10) {
					intentgetLogCat.setClass(getApplicationContext(), LogcatviewActivity.class);
					startActivity(intentgetLogCat);
				}
				if (_position == 11) {
					intentgetLogCat.setClass(getApplicationContext(), IconmodActivity.class);
					startActivity(intentgetLogCat);
				}
				if (_position == 12) {
					_drawer.closeDrawer(GravityCompat.START);
					finishAffinity();
				}
						}
				});
		for(int _repeat471 = 0; _repeat471 < (int)(13); _repeat471++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("key", "");
				hsi.add(_item);
			}
			
		}
		_drawer_mlist.setAdapter(new MyListViewListAdapter(hsi));
		((BaseAdapter)_drawer_mlist.getAdapter()).notifyDataSetChanged();
		GradientDrawable abs = new GradientDrawable();
		abs.setCornerRadius(55f);
		abs.setColor(Color.parseColor("#91FF95A1"));
		_drawer_mlist.setSelector(abs);
		_drawer.addDrawerListener(new DrawerLayout.DrawerListener() {
			          @Override
			          public void onDrawerSlide(View drawerView, float offset) {
				            View container = findViewById(R.id.linear1);
				            container.setTranslationX(offset * ((_drawer.getWidth()/2)+20));
				          }
			          @Override public void onDrawerOpened(View drawerView) {
				          }
			          @Override public void onDrawerClosed(View drawerView) {
				          }
			          @Override public void onDrawerStateChanged(int newState) {
				
				          }
			        });
	}
	
	@Override
	public void onBackPressed() {
		if (Chack) {
			_cleardata();
		}
		else {
			if (sd_stor.hasRealRemovableSdCarde()) {
				if ((Folder.equals(FileUtil.getExternalStorageDir()) || Folder.equals(sd_stor.getExtSdPath())) || (cache.size() == 0)) {
					gotoback++;
					if (gotoback == 3) {
						Chack = false;
						isCopyAndMoved = false;
						imageview1.setImageResource(R.drawable.folderhome);
						imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
						linear9.setVisibility(View.GONE);
						new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
						    .setTitle(getResources().getString(R.string.exitapp))
						.setMessage(getResources().getString(R.string.exitappmsg))
						.setNeutralButton(getResources().getString(R.string.yes), (p, d) -> {
							
							         gotoback = 0;
							finishAffinity();
							
										})
						.setPositiveButton(getResources().getString(R.string.no), (p1, d2) -> {
							
							         gotoback = 0;
							
										})
						.setCancelable(false)
						.show();
						
						
						
						
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "برای خروج ۳ بار کلیک کنید");
					}
				}
				else {
					Folder = Folder.substring((int)(0), (int)(Folder.lastIndexOf("/")));
					position = cache.get((int)(cache.size() - 1)).doubleValue();
					cache.remove((int)(cache.size() - 1));
					_getFiles("");
					recyclerview2.setAdapter(new Recyclerview2Adapter(files));
					recyclerview2.getAdapter().notifyDataSetChanged();
					 ((LinearLayoutManager) recyclerview2.getLayoutManager()).scrollToPositionWithOffset((int)position, (int)3);
				}
			}
			else {
				if (Folder.equals(FileUtil.getExternalStorageDir()) || (cache.size() == 0)) {
					gotoback++;
					if (gotoback == 3) {
						Chack = false;
						isCopyAndMoved = false;
						imageview1.setImageResource(R.drawable.folderhome);
						imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
						linear9.setVisibility(View.GONE);
						new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
						    .setTitle(getResources().getString(R.string.exitapp))
						.setMessage(getResources().getString(R.string.exitappmsg))
						.setNeutralButton(getResources().getString(R.string.yes), (p, d) -> {
							
							         gotoback = 0;
							finishAffinity();
							
										})
						.setPositiveButton(getResources().getString(R.string.no), (p1, d2) -> {
							
							         gotoback = 0;
							
										})
						.setCancelable(false)
						.show();
						
						
						
						
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "برای خروج ۳ بار کلیک کنید");
					}
				}
				else {
					Folder = Folder.substring((int)(0), (int)(Folder.lastIndexOf("/")));
					position = cache.get((int)(cache.size() - 1)).doubleValue();
					cache.remove((int)(cache.size() - 1));
					_getFiles("");
					recyclerview2.setAdapter(new Recyclerview2Adapter(files));
					recyclerview2.getAdapter().notifyDataSetChanged();
					 ((LinearLayoutManager) recyclerview2.getLayoutManager()).scrollToPositionWithOffset((int)position, (int)3);
				}
			}
		}
	}
	
	
	@Override
	public void onResume() {
		super.onResume();
		_refreshTabs();
	}
	public void _getFiles(final String _path) {
		list.clear();
		files.clear();
		folderList.clear();
		fileList.clear();
		FileUtil.listDir(Folder, list);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		GetTab = Folder;
		index = 0;
		final class FileComparator implements Comparator<String> {
			public int compare(String f1, String f2) {
				if(f1 == f2) return 0;
				if(FileUtil.isDirectory(f1) && FileUtil.isFile(f2))
				return -1;
				if(FileUtil.isFile(f1) && FileUtil.isDirectory(f2))
				return 1;
				return f1.compareToIgnoreCase(f2);
			}
		}
		Collections.sort(list, new FileComparator());
		
		for(int _repeat13 = 0; _repeat13 < (int)(list.size()); _repeat13++) {
			if (FileUtil.isDirectory(list.get((int)(index)))) {
				folderList.add(list.get((int)(index)));
			}
			else {
				fileList.add(list.get((int)(index)));
			}
			index++;
		}
		index = 0;
		for(int _repeat37 = 0; _repeat37 < (int)(folderList.size()); _repeat37++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("path", folderList.get((int)(index)));
				files.add(_item);
			}
			
			index++;
		}
		index = 0;
		for(int _repeat54 = 0; _repeat54 < (int)(fileList.size()); _repeat54++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("path", fileList.get((int)(index)));
				files.add(_item);
			}
			
			index++;
		}
		index = 0;
		for(int _repeat97 = 0; _repeat97 < (int)(files.size()); _repeat97++) {
			files.get((int)index).put("sel", "false");
			index++;
		}
		if (list.size() == 0) {
			recyclerview2.setVisibility(View.GONE);
			Calciolater.setVisibility(View.VISIBLE);
		}
		else {
			recyclerview2.setVisibility(View.VISIBLE);
			Calciolater.setVisibility(View.GONE);
		}
		recyclerview2.setAdapter(new Recyclerview2Adapter(files));
		recyclerview2.setLayoutManager(new LinearLayoutManager(this));
		recyclerview2.setHasFixedSize(true);
		_distreeview();
		_isCopyOrMove();
	}
	
	
	public void _folder() {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.makefolder)
		.setTitle("Folder")
		.setMessage("make folder")
		.setCancelable(true)
		.setPositiveButton("make", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       com.google.android.material.textfield.TextInputLayout top = dialog.findViewById(R.id.top);		
			
			EditText editor = dialog.findViewById(R.id.editor);		
			
			Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			if (editor.getText().toString().isEmpty()) {
				positive.setEnabled(false);
			}
			else {
				positive.setEnabled(true);
			}
			top.setCounterEnabled(true);
			top.setCounterMaxLength(200);
			top.setBoxStrokeColor(0xFFFDA893);
			top.setCounterTextColor(ColorStateList.valueOf(0xFFFDA893));
			top.setEndIconTintMode(PorterDuff.Mode.MULTIPLY);
			top.setEndIconTintList(ColorStateList.valueOf(0xFFFFDCB9));
			top.setEndIconDrawable(R.drawable.close);
			top.setEndIconOnClickListener(v ->{
					editor.setText("");
			});
			
			positive.setOnClickListener((vftrororocjj) -> {
				
				             SketchwareUtil.hideKeyboard(getApplicationContext());
				if (editor.getText().toString().isEmpty()) {
					top.setError("return type Error \n");
				}
				else {
					CreateFolder = editor.getText().toString();
					try{
						
						if (!FileUtil.isFile(Folder.concat("/".concat(CreateFolder.concat("/"))))) {
							FileUtil.makeDir(Folder.concat("/".concat(CreateFolder.concat("/"))));
							_getFiles("");
						}
						else {
							
						}
					}catch(Exception e){
						 
					}
				}
				dialog.dismiss();
								
						});
			editor.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (editor.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
		});
		dialog.show();
	}
	
	
	public void _file() {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.makefolder)
		.setTitle("File")
		.setMessage("make file")
		.setCancelable(true)
		.setPositiveButton("make", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       com.google.android.material.textfield.TextInputLayout top = dialog.findViewById(R.id.top);		
			
			EditText editor = dialog.findViewById(R.id.editor);		
			
			Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			top.setEndIconVisible(true);
			if (editor.getText().toString().isEmpty()) {
				positive.setEnabled(false);
			}
			else {
				positive.setEnabled(true);
			}
			top.setCounterEnabled(true);
			top.setCounterMaxLength(200);
			top.setBoxStrokeColor(0xFFFDA893);
			
			positive.setOnClickListener((vftrororocjj) -> {
				
				             SketchwareUtil.hideKeyboard(getApplicationContext());
				dialog.dismiss();
				if (editor.getText().toString().isEmpty()) {
					top.setError("return type Error");
				}
				else {
					mainfile = editor.getText().toString();
					try{
						if (mainfile.equals("")) {
							_file();
						}
						else {
							if (!mainfile.contains("/")) {
								if (mainfile.contains(".html")) {
									FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "<!--code by Ghost web IDE version 1.1.4-->\n<!--بهتر است این قسمت حذف نشود -->\n<html lang=\"en\">\n	<head>\n		<!--meta code dont Romved-->\n		<meta charset=\"UTF-8\">\n		<!--code Style -->\n		<style>\n		*{\n		background-color: black;\n		text-align: center;\n		}\n		p , h1 {\n		font-weight: normal;\n		color: #ffffb9;\n		}\n		</style>\n		</head>\n		<!--class Style -->\n	<div class=\"Ghost\">\n	<!--Text Styles -->\n	<h1>Hello word to Ghost web</h1>\n	<p>in paiam faqet bari test ast na hish aml card digeh</p>\n		</div>\n	<!--End codes good luck code by ninja coder-->\n	</html>\n");
									_getFiles("");
								}
								else {
									if (mainfile.contains(".c")) {
										FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "////code by Ghost web \n\n");
										_getFiles("");
									}
									else {
										if (mainfile.contains(".py")) {
											FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "#Code by Ghost web version 1.4.8\nimport os \n\ndef number01(a,b):\n	return a*b\ndef number02(a,b):\n	return a/b\n	\nprint(number01(20,30))\nprint(number02(30,90))\n\n");
											_getFiles("");
										}
										else {
											if (mainfile.contains(".cs")) {
												FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "///code by Ghost web");
												_getFiles("");
											}
											else {
												if (mainfile.contains(".cpp")) {
													FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "\n#include<iosteram>\nusing namespace std;\n\nvoid foo(){\n	cout << \"Ghost web ide \" << \"Version\" << \"1.4.8\";\n}\n\nint main(){\n	int b{1};\n	cout << \"Type Number\" << endl;\n	cin >> b >> b + 10 ;\n	cout << \"Done\" << endl;\n}\n");
													_getFiles("");
												}
												else {
													if (mainfile.contains(".json")) {
														FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "[\n{\n    \"name\":\"hosein\",\n    \"age\":26,\n    \"run\":true,\n    \"liveiniran\":null\n}\n]");
														_getFiles("");
													}
													else {
														if (mainfile.contains(".sh")) {
															FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "##code by Ghost web\n\necho \"Hello Ninjacoder\"");
															_getFiles("");
														}
														else {
															if (mainfile.contains(".xml")) {
																FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "<?xml version=\"1.0\" encoding=\"utf-8\"?>");
																_getFiles("");
															}
															else {
																if (mainfile.contains(".java")) {
																	FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "/*\nCode by Ghost web Ide version 1.4.3\n*/\n\nimport android.widget.*;\nimport java.util.*;\n\n\npublic class ".concat(Uri.parse(mainfile.replace(".java", " ")).getLastPathSegment().concat("{\n    private static Context context;\n    public static main(String[] Result){\n        \n        Toast.maketext(context ,\"Hi to Ghost Web Ide \",Toast.LENGTH_SHORT).show();\n    }\n    public static boolean Bio(){\n        \n        return false;\n    }\n    public static String test(String str){\n        \n        return str;\n    }\n    public static double vorger(){\n        \n        return 0;\n    }\n}")));
																	_getFiles("");
																}
																else {
																	if (mainfile.contains(".ninja")) {
																		FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "/*\nCode by Ghost Web Ide version 1.4.8\n*/\n\nfrom ConText import *\nfrom Printor import printor\npublic class shr ".concat(Uri.parse(mainfile.replace(".ninja", " ")).getLastPathSegment().concat("\n{\n	val h ? \n	val b ?\n	public Board(v){\n		\n		System.out.At(?0)\n	}\n	public abstract Hsi (){\n		\n		public synchronized inker(int32 i int32 bpr){\n            printor(inker(i/bpr))\n        }\n		\n	}\n	\n}\n")));
																		_getFiles("");
																	}
																	else {
																		if (mainfile.contains(".js")) {
																			FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "console.log('♤♤♤')");
																			_getFiles("");
																		}
																		else {
																			if (mainfile.contains(".kt")) {
																				FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "public class ".concat(Uri.parse(Folder.replace(".kt", "")).getLastPathSegment().concat("(){\n	fun codeTest1(p:Int):Int{\n		return p\n	}\n	fun codeTest2(p:String):String{\n		return p\n	}\n	val jj = codeTest1(2)\n	println(jj)\n	val jj1 = codeTest2(\"Hello word to Ghost web ide version 1.4.9\")\n	println(jj1)\n}\n")));
																				_getFiles("");
																			}
																			else {
																				FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "");
																				_getFiles("");
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
							else {
								if (FileUtil.isExistFile(Folder.concat("/".concat(mainfile)))) {
									_getFiles("");
								}
								else {
									
								}
							}
						}
						
					}catch(Exception e){
						 
					}
				}
								
						});
			editor.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (editor.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					iconPath.codeUifer(editor,top);
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
		});
		dialog.show();
	}
	
	
	public void _extoram() {
	}
	private void copyAllFilesAssets(String assetsFolder, String outPath) {
		    AssetManager assetManager = getAssets();
		    String[] files = null;
		    try {
			        files = assetManager.list(assetsFolder);
			    } catch (java.io.IOException e) {
			        
			    }
		    if (files != null) for (String filename : files) {
			        java.io.InputStream in = null;
			        java.io.OutputStream out = null;
			        try {
				          in = assetManager.open(assetsFolder+"/"+filename);
				          java.io.File outFile = new java.io.File(outPath, filename);
				          if (!(outFile.exists())) {// File does not exist...
					                out = new java.io.FileOutputStream(outFile);
					                copyFile(in, out);
					                showMessage("success !");
					          }
				        } catch(java.io.IOException e) {
				            showMessage(e.toString());
				        }     
			        finally {
				            if (in != null) {
					                try {
						                    in.close();
						                } catch (java.io.IOException e) {
						                    // NOOP
						                }
					            }
				            if (out != null) {
					                try {
						                    out.close();
						                } catch (java.io.IOException e) {
						                    // NOOP
						                }
					            }
				        }  
			    }
	}
	private void copyFile(java.io.InputStream in, java.io.OutputStream out) throws java.io.IOException {
		    byte[] buffer = new byte[1024];
		    int read;
		    while((read = in.read(buffer)) != -1){
			      out.write(buffer, 0, read);
			    }
	}
	
	private void copyOneFileFromAssets(final String assetFilename, final String assetSavePath) {
		  			try{
			  				int count;
			  				java.io.InputStream input = getAssets().open(assetFilename);
			  				java.io.OutputStream output = new  java.io.FileOutputStream(assetSavePath+"/"+assetFilename);
			  				byte data[] = new byte[1024];
			  				while ((count = input.read(data))>0) {
				  					output.write(data, 0, count);
				  			}
			  				output.flush();
			  				output.close();
			  				input.close();
			  				
			  				SketchwareUtil.showMessage(getApplicationContext(), "success ");
			  		}catch(Exception e){
			  				
			  				SketchwareUtil.showMessage(getApplicationContext(), "failed !");
			  		}
	}
	{
	}
	
	
	public void _Ripple_Drawable(final View _view, final String _c) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_c)}); android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null); _view.setBackground(ripdr);
	}
	
	
	public void _refreshTabs() {
		if (shp.contains("path")) {
			if (!shp.getString("path", "").equals("")) {
				newlistmap = new Gson().fromJson(shp.getString("path", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			}
		}
	}
	
	
	public void _checkListMap2(final double _position, final String _key, final ArrayList<HashMap<String, Object>> _listmap1, final ArrayList<HashMap<String, Object>> _listmap2) {
		tab = _listmap1.get((int)_position).get(_key).toString();
		shp.edit().putString("pos_path", _listmap1.get((int)_position).get(_key).toString()).commit();
		if (_listmap2.isEmpty()) {
			positionTabs = 0;
			activitiy.setClass(getApplicationContext(), CodeeditorActivity.class);
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put(_key, _listmap1.get((int)_position).get(_key).toString());
				_listmap2.add(_item);
			}
			
			shp.edit().putString(_key, new Gson().toJson(_listmap2)).commit();
			shp.edit().putString("positionTabs", String.valueOf((long)(positionTabs))).commit();
			startActivity(activitiy);
		}
		else {
			n = 0;
			while(true) {
				if (_listmap2.get((int)n).get(_key).toString().contains(tab)) {
					activitiy.setClass(getApplicationContext(), CodeeditorActivity.class);
					shp.edit().putString("positionTabs", String.valueOf((long)(n))).commit();
					startActivity(activitiy);
					break;
				}
				else {
					if (n == (_listmap2.size() - 1)) {
						activitiy.setClass(getApplicationContext(), CodeeditorActivity.class);
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put(_key, _listmap1.get((int)_position).get(_key).toString());
							_listmap2.add(_item);
						}
						
						shp.edit().putString(_key, new Gson().toJson(_listmap2)).commit();
						shp.edit().putString("positionTabs", String.valueOf((long)(_listmap2.size() - 1))).commit();
						activitiy.putExtra("htmlcode", _listmap1.get((int)_position).get(_key).toString());
						startActivity(activitiy);
						break;
					}
				}
				n++;
			}
		}
	}
	
	
	public void _zooo() {
	}
	private boolean zipEntryMatch(String zeName, java.io.File[]  files, String path){
		    for(int i = 0; i < files.length; i++){
			        if((path + files[i] .getName()).equals(zeName)){
				            return true;
				        }
			    }
		    return false;
	}
	
	    public static class ZipUtils {
		
		        private final List<java.io.File> fileList;
		
		        private List<String> paths;
		
		        public ZipUtils() {
			            fileList = new ArrayList<>();
			            paths = new ArrayList<>(25);
			        }
		
		        public void zipIt(java.io.File sourceFile, java.io.File zipFile) {
			            if (sourceFile.isDirectory()) {
				                byte[]  buffer = new byte[1024] ;
				                java.io.FileOutputStream fos = null;
				                java.util.zip.ZipOutputStream zos = null;
				
				                try {
					
					
					
					                    String sourcePath = sourceFile.getParentFile().getPath();
					                    generateFileList(sourceFile);
					
					                    fos = new java.io.FileOutputStream(zipFile);
					                    zos = new java.util.zip.ZipOutputStream(fos);
					
					                    System.out.println("Output to Zip : " + zipFile);
					                    java.io.FileInputStream in = null;
					
					                    for (java.io.File file : this.fileList) {
						                        String path = file.getParent().trim();
						                        path = path.substring(sourcePath.length());
						
						                        if (path.startsWith(java.io.File.separator)) {
							                            path = path.substring(1);
							                        }
						
						                        if (path.length() > 0) {
							                            if (!paths.contains(path)) {
								                                paths.add(path);
								                                java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry(path + "");
								                                zos.putNextEntry(ze);
								                                zos.closeEntry();
								                            }
							                            path += "/";
							                        }
						
						                        String entryName = path.substring((int)(0), (int)(path.lastIndexOf("/")))+ "/" + file.getName();
						                        System.out.println("File Added : " + entryName);
						                        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry(entryName);
						
						                        zos.putNextEntry(ze);
						                        try {
							                            in = new java.io.FileInputStream(file);
							                            int len;
							                            while ((len = in.read(buffer)) > 0) {
								                                zos.write(buffer, 0, len);
								                            }
							                        } finally {
							                            in.close();
							                        }
						                    }
					
					                    zos.closeEntry();
					                    System.out.println("Folder successfully compressed");
					
					                } catch (java.io.IOException ex) {
					                    ex.printStackTrace();
					                } finally {
					                    try {
						                        zos.close();
						                    } catch (java.io.IOException e) {
						                        e.printStackTrace();
						                    }
					                }
				            }
			        }
		
		        protected void generateFileList(java.io.File node) {
			
			            if (node.isFile()) {
				                fileList.add(node);
				            }
			            if (node.isDirectory()) {
				                java.io.File[]  subNote = node.listFiles();
				                for (java.io.File filename : subNote) {
					                    generateFileList(filename);
					                }
				            }
			        }
		    }
	public  java.io.File newFile(java.io.File destinationDir, java.util.zip.ZipEntry zipEntry) throws java.io.IOException {
		    java.io.File destFile = new java.io.File(destinationDir, zipEntry.getName());
		
		    String destDirPath = destinationDir.getCanonicalPath();
		    String destFilePath = destFile.getCanonicalPath();
		
		    if (!destFilePath.startsWith(destDirPath + java.io.File.separator)) {
			        throw new java.io.IOException("Entry is outside of the target dir: " + zipEntry.getName());
			    }
		
		    return destFile;
	}
	
	
	public void _distreeview() {
		treeviewmap.clear();
		String _path_ = Folder;
		
		_path_ = _path_.replaceFirst("/", "");
		String[] _path_list_ = _path_.split("/");
		for(int _i_ = 0; _i_ < _path_list_.length; _i_++) {
			 {
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("mo", _path_list_[_i_]);
					treeviewmap.add(_item);
			}
		}
		
		
		recyclerview1.setAdapter(new Recyclerview1Adapter(treeviewmap));
		recyclerview1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
		recyclerview1.smoothScrollToPosition((int)treeviewmap.size());
	}
	
	
	public void _android11() {
	}
	// youtube channel Hichem Soft
	private HichemSoftFileUtil utils;
	private SharedPreferences sharedPreferences;
	
	 @Override
	    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		        super.onActivityResult(_requestCode, _resultCode, _data);
		        if (_resultCode == Activity.RESULT_OK) {
			            if (_data != null) {
				                        utils.persistFolder(
				                                _data
				                        );
				            } else {
				
				            }
			        } else {
			        }
		    }
	{
		
		
		
		
		
	}
	
	
	public void _libmassngerTotoal() {
	}
	public static void copyFolder(java.io.File source, java.io.File destination)
	{
		    if (source.isDirectory())
		    {
			        if (!destination.exists())
			        {
				            destination.mkdirs();
				        }
			
			        String files[]  = source.list();
			
			        for (String file : files)
			        {
				            java.io.File srcFile = new java.io.File(source, file);
				            java.io.File destFile = new java.io.File(destination, file);
				
				            copyFolder(srcFile, destFile);
				        }
			    }
		    else
		    {
			        java.io.InputStream in = null;
			        java.io.OutputStream out = null;
			
			        try
			        {
				            in = new java.io.FileInputStream(source);
				            out = new java.io.FileOutputStream(destination);
				
				            byte[]  buffer = new byte[1024];
				
				            int length;
				            while ((length = in.read(buffer)) > 0)
				            {
					                out.write(buffer, 0, length);
					            }
				        }
			        catch (Exception e)
			        {
				            try
				            {
					                in.close();
					            }
				            catch (java.io.IOException e1)
				            {
					                e1.printStackTrace();
					            }
				
				            try
				            {
					                out.close();
					            }
				            catch (java.io.IOException e1)
				            {
					                e1.printStackTrace();
					            }
				        }
			    }
	}
	{
	}
	
	
	public void _setFileAndFolder(final boolean _checked, final double _position) {
		if (_checked) {
			test.get((int)_position).put("selected", "true");
		}
		else {
			test.get((int)_position).put("selected", "false");
		}
		shp.edit().putString("sel", new Gson().toJson(test)).commit();
	}
	
	
	public void _cut() {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				if (copyOrMove.isEmpty()) {
					index = files.size() - 1;
					for(int _repeat15 = 0; _repeat15 < (int)(files.size()); _repeat15++) {
						if (files.get((int)index).get("sel").toString().equals("true")) {
							copyOrMove.add(files.get((int)index).get("path").toString());
						}
						index--;
					}
					SketchwareUtil.showMessage(getApplicationContext(), "Select a folder to move files");
					isCopyAndMoved = true;
					Chack = false;
					copy.setVisibility(View.GONE);
					del1.setVisibility(View.GONE);
					ra.setVisibility(View.GONE);
					setupRanmeFile.setVisibility(View.GONE);
					imageview1.setImageResource(R.drawable.close);
					imageview1.setColorFilter(0xFFE57373, PorterDuff.Mode.MULTIPLY);
					linear9.setVisibility(View.VISIBLE);
					recyclerview2.setAdapter(new Recyclerview2Adapter(files));
					recyclerview2.getAdapter().notifyDataSetChanged();
				}
				else {
					index = copyOrMove.size() - 1;
					for(int _repeat36 = 0; _repeat36 < (int)(copyOrMove.size()); _repeat36++) {
						if (FileUtil.isDirectory(copyOrMove.get((int)(index)))) {
							FileUtil.copyDir(copyOrMove.get((int)(index)), Folder.concat("/").concat(Uri.parse(copyOrMove.get((int)(index))).getLastPathSegment()));
							FileUtil.deleteFile(copyOrMove.get((int)(index)));
						}
						else {
							FileUtil.moveFile(copyOrMove.get((int)(index)), Folder.concat("/").concat(Uri.parse(copyOrMove.get((int)(index))).getLastPathSegment()));
						}
						index--;
					}
					isCopyAndMoved = false;
					Chack = false;
					SketchwareUtil.showMessage(getApplicationContext(), "Files moved");
					copy.setVisibility(View.VISIBLE);
					del1.setVisibility(View.VISIBLE);
					ra.setVisibility(View.VISIBLE);
					linear9.setVisibility(View.GONE);
					setupRanmeFile.setVisibility(View.VISIBLE);
					imageview1.setImageResource(R.drawable.folderhome);
					imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
					conter = 0;
					linear9.setVisibility(View.GONE);
					recyclerview2.setAdapter(new Recyclerview2Adapter(files));
					recyclerview2.getAdapter().notifyDataSetChanged();
				}
			}
		});
	}
	
	
	public void _isCopyOrMove() {
		if (isCopyAndMoved) {
			cansel.setVisibility(View.VISIBLE);
			copy.setText("past");
			cuts.setText("past");
			makeproject.setText("AddProject");
		}
		else {
			_cleardata();
		}
	}
	
	
	public void _cleardata() {
		copyOrMove.clear();
		zip.clear();
		Chack = false;
		conter = 0;
		isCopyAndMoved = false;
		cansel.setVisibility(View.GONE);
		linearDis.setVisibility(View.GONE);
		linear9.setVisibility(View.GONE);
		copy.setText("copy");
		cuts.setText("cut");
		getItems.setText("0");
	}
	
	
	public void _delet() {
		try {
			                   index = files.size() - 1;
			for(int _repeat13 = 0; _repeat13 < (int)(files.size()); _repeat13++) {
				if (files.get((int)index).get("sel").toString().equals("true")) {
					proh = "";
					FileUtil.deleteFile(files.get((int)index).get("path").toString());
				}
				index--;
			}
			conter = 0;
			linear9.setVisibility(View.VISIBLE);
			Chack = false;
			isCopyAndMoved = false;
			_getFiles("");
				} catch (Exception exception) {
			final var mm = new GradientDrawable();
						mm.setColor(Color.parseColor("#192730"));
						mm.setStroke(1, Color.parseColor("#CDE8F9"));
						mm.setCornerRadius(21f);
						final var malterDialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
						malterDialog.setTitle("Error");
			         malterDialog.setBackground(mm);
						StringBuffer sb = new StringBuffer(500);
						StackTraceElement[] st = exception.getStackTrace();
						sb.append(exception.getClass().getName() + " : " + exception.getMessage() + "\n");
						for (int iii = 0; iii < st.length; iii++) {
								sb.append("\t at ⟶" + st[iii].toString() + "\n");
						}
			
						final LinearLayout linearLayout = new LinearLayout(getApplicationContext());
			
						linearLayout.setPadding(8, 8, 8, 8);
			
						final TextView mtextView = new TextView(getApplicationContext());
			
						mtextView.setPadding(8, 8, 8, 8);
			              mtextView.setTextColor(Color.parseColor("#FFFFCE9A"));;
			
						mtextView.setTextIsSelectable(true);
			
						linearLayout.addView(mtextView);
			
						mtextView.setText(sb.toString());
			
						{
								SpannableString spannableString = new SpannableString(mtextView.getText().toString());
								Matcher matcher = Pattern.compile("(^(.*)|(?<=:)\\d+)").matcher(mtextView.getText().toString());
				
								while (matcher.find()) {
					
										spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFFF9A9A")), matcher.start(), matcher.end(),
												Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
										spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 33);
					
								}
				
								mtextView.setText(spannableString);
						}
			          malterDialog.setNegativeButton("Dismiss",(Dialog,iii) -> {
								
						});
						malterDialog.setView(linearLayout);
						malterDialog.show();
				}
	}
	
	
	public void _copyfile() {
		try {
			                   runOnUiThread(new Runnable() {
				@Override
				public void run() {
					if (copyOrMove.isEmpty()) {
						index = files.size() - 1;
						for(int _repeat15 = 0; _repeat15 < (int)(files.size()); _repeat15++) {
							if (files.get((int)index).get("sel").toString().equals("true")) {
								copyOrMove.add(files.get((int)index).get("path").toString());
							}
							index--;
						}
						SketchwareUtil.showMessage(getApplicationContext(), "Select a folder to copy files");
						isCopyAndMoved = true;
						Chack = false;
						cuts.setVisibility(View.GONE);
						del1.setVisibility(View.GONE);
						ra.setVisibility(View.GONE);
						linear8.setVisibility(View.VISIBLE);
						setupRanmeFile.setVisibility(View.GONE);
						imageview1.setImageResource(R.drawable.close);
						imageview1.setColorFilter(0xFFEF9A9A, PorterDuff.Mode.MULTIPLY);
						recyclerview2.setAdapter(new Recyclerview2Adapter(files));
						recyclerview2.getAdapter().notifyDataSetChanged();
					}
					else {
						try{
									index = copyOrMove.size() - 1;
							for(int _repeat36 = 0; _repeat36 < (int)(copyOrMove.size()); _repeat36++) {
								if (FileUtil.isDirectory(copyOrMove.get((int)(index)))) {
									FileUtil.copyDir(copyOrMove.get((int)(index)), Folder.concat("/").concat(Uri.parse(copyOrMove.get((int)(index))).getLastPathSegment()));
								}
								else {
									FileUtil.copyFile(copyOrMove.get((int)(index)), Folder.concat("/").concat(Uri.parse(copyOrMove.get((int)(index))).getLastPathSegment()));
								}
								index--;
							}
							SketchwareUtil.showMessage(getApplicationContext(), "Files copied");
							cuts.setVisibility(View.VISIBLE);
							del1.setVisibility(View.VISIBLE);
							ra.setVisibility(View.VISIBLE);
							linear9.setVisibility(View.GONE);
							setupRanmeFile.setVisibility(View.VISIBLE);
							imageview1.setImageResource(R.drawable.folderhome);
							imageview1.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
							isCopyAndMoved = false;
							conter = 0;
							linear9.setVisibility(View.GONE);
							recyclerview2.setAdapter(new Recyclerview2Adapter(files));
							recyclerview2.getAdapter().notifyDataSetChanged();
						}catch(Exception ex){
									final AlertDialog.Builder malterDialog = new AlertDialog.Builder(FiledirActivity.this);
									StringBuffer sb = new StringBuffer(500); 
									StackTraceElement[] st =ex.getStackTrace(); 
									sb.append(ex.getClass().getName() + ": " +ex.getMessage() + "\n"); 
									for (int iii = 0; iii < st.length; iii++) { 
												sb.append("\t at ⟶" + st[iii].toString() + "\n"); 
									}
									
									final LinearLayout lin = new LinearLayout(getApplicationContext());
									
									lin.setPadding(8,8,8,8);
									
									final TextView txt = new TextView(getApplicationContext());
									
									txt.setPadding(8,8,8,8);
									
									txt.setTextIsSelectable(true);
									
									lin.addView(txt);
									
									txt.setText(sb.toString());
									
									
									{
												SpannableString spannableString = new SpannableString(txt.getText().toString());
												Matcher matcher = Pattern.compile("(^(.*)|(?<=:)\\d+)").matcher(txt.getText().toString());
												
												
												
												
												while (matcher.find()) {
															
															
															spannableString.setSpan(new ForegroundColorSpan(0xFFB71C1C), matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
															spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 33);
															
												}
												
												
												
												txt.setText(spannableString);
									}
									malterDialog.setView(lin);
									malterDialog.show();
						}
						
					}
				}
			});
				} catch (Exception exception) {
			final var mm = new GradientDrawable();
						mm.setColor(Color.parseColor("#192730"));
						mm.setStroke(1, Color.parseColor("#CDE8F9"));
						mm.setCornerRadius(21f);
						final var malterDialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
						malterDialog.setTitle("Error");
			         malterDialog.setBackground(mm);
						StringBuffer sb = new StringBuffer(500);
						StackTraceElement[] st = exception.getStackTrace();
						sb.append(exception.getClass().getName() + " : " + exception.getMessage() + "\n");
						for (int iii = 0; iii < st.length; iii++) {
								sb.append("\t at ⟶" + st[iii].toString() + "\n");
						}
			
						final LinearLayout linearLayout = new LinearLayout(getApplicationContext());
			
						linearLayout.setPadding(8, 8, 8, 8);
			
						final TextView mtextView = new TextView(getApplicationContext());
			
						mtextView.setPadding(8, 8, 8, 8);
			              mtextView.setTextColor(Color.parseColor("#FFFFCE9A"));;
			
						mtextView.setTextIsSelectable(true);
			
						linearLayout.addView(mtextView);
			
						mtextView.setText(sb.toString());
			
						{
								SpannableString spannableString = new SpannableString(mtextView.getText().toString());
								Matcher matcher = Pattern.compile("(^(.*)|(?<=:)\\d+)").matcher(mtextView.getText().toString());
				
								while (matcher.find()) {
					
										spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFFF9A9A")), matcher.start(), matcher.end(),
												Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
										spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 33);
					
								}
				
								mtextView.setText(spannableString);
						}
			          malterDialog.setNegativeButton("Dismiss",(Dialog,iii) -> {
								
						});
						malterDialog.setView(linearLayout);
						malterDialog.show();
				}
	}
	
	
	public void _prot(final String _input, final String _output) {
		GhostFile.GetCopyFile(FiledirActivity.this,_input,_output);
	}
	
	
	public void _bot1(final String _input, final String _output) {
		GhostFile.GetCutFile(FiledirActivity.this,_input,_output);
	}
	
	
	public void _AllAnimWork(final View _view) {
		AnimUtils.Worker(_view);
	}
	
	
	public void _selAll(final double _length, final String _key, final String _vlue, final ArrayList<HashMap<String, Object>> _data) {
		for (int pos = 0; pos < (int)(_length); pos++) {
			_data.get((int)pos).put(_key, _vlue);
		}
	}
	
	
	public void _getSetItem() {
		index = files.size() - 1;
		for(int _repeat13 = 0; _repeat13 < (int)(files.size()); _repeat13++) {
			if (files.get((int)index).get("sel").toString().equals("true")) {
				copyOrMove.add(files.get((int)index).get("path").toString());
			}
			index--;
		}
	}
	
	
	public void _doalog() {
		
	}
	
	
	public boolean _isPasswordRequired(final String _zipPath) {
		try {
			return new com.zip4j.ZipFile(_zipPath).isEncrypted();
		} catch(Exception e) {
			    
		}
		return false;
	}
	
	
	public void _background_working_lib() {
	}
	public static abstract class _BackgroundTaskClass {
		
		    private Activity activity;
		    public _BackgroundTaskClass(Context activity) {
			        this.activity = (Activity) activity;
			    }
		
		    private void startBackground() {
			        new Thread(new Runnable() {
				            public void run() {
					
					                doInBackground();
					                activity.runOnUiThread(new Runnable() {
						                    public void run() {
							
							                        onPostExecute();
							                    }
						                });
					            }
				        }).start();
			    }
		    public void execute(){
			        startBackground();
			    }
		
		    public abstract void doInBackground();
		    public abstract void onPostExecute();
		
	}
	{
	}
	
	
	public void _Zip(final ArrayList<String> _files, final String _password, final String _path) {
		/*thanks to Star2Droid channel & some zip4j library & some help from kind people on stackoverflow to help me out */
		
		
		new _BackgroundTaskClass(getCurrentContext(this)) {
				@Override
				public void doInBackground() {
						zip = _files;
						for (String vb: zip)  {
								try {
										try {
												java.lang.Thread.sleep(50);
										}  catch (java.lang.InterruptedException exc){} 
										com.zip4j.model.ZipParameters zipParameters = new com.zip4j.model.ZipParameters();
										zipParameters.setEncryptFiles(true);
										zipParameters.setCompressionLevel(com.zip4j.model.enums.CompressionLevel.FASTEST);
										zipParameters.setEncryptionMethod(com.zip4j.model.enums.EncryptionMethod.AES);
										zipParameters.setAesKeyStrength(com.zip4j.model.enums.AesKeyStrength.KEY_STRENGTH_256); 
										zipParameters.setCompressionMethod(com.zip4j.model.enums.CompressionMethod.STORE);
										com.zip4j.ZipFile zipFile = new com.zip4j.ZipFile(_path, _password.toCharArray());
										if (FileUtil.isDirectory(vb)) {
												
												zipFile.addFolder(new java.io.File(vb), zipParameters);
										}
										else {
												
												zipFile.addFile(new java.io.File(vb), zipParameters);
										}
								} catch (Exception e) {
								}
						}
						//put you background code
						//same like doingBackground
						//Background Thread
						
						
						
				}
				
				@Override
				public void onPostExecute() {
						
						//hear is result part same
						//same like post execute
						//UI Thread(update your UI widget)
				}
		}.execute();
	}
	public Context getCurrentContext(Context context) {
		return context;
	}
	public Context getCurrentContext(Fragment context) {
		return context.getActivity();
	}
	public Context getCurrentContext(DialogFragment context) {
		return context.getActivity();
	}
	{
		
	}
	
	
	public void _Unzip(final String _zip, final String _password, final String _path) {
		new _BackgroundTaskClass(getCurrentContext(this)) {
				@Override
				public void doInBackground() {
						try {
								com.zip4j.ZipFile zipFile = new com.zip4j.ZipFile(_zip);
								if (zipFile.isEncrypted()) {
										zipFile.setPassword(_password.toCharArray());
								}
								zipFile.extractAll(_path); 
						} catch (Exception e) {
						}
						//put you background code
						//same like doingBackground
						//Background Thread
						
						
						
				}
				
				@Override
				public void onPostExecute() {
						
						//hear is result part same
						//same like post execute
						//UI Thread(update your UI widget)
				}
		}.execute();
		
	}
	
	
	public void _ex() {
	}
	public final class ZipperFF {
		
		        private  java.io.FileOutputStream fos;
		        private  java.util.zip.ZipOutputStream zos;
		        private  java.io.BufferedOutputStream bos;
		        private  java.util.zip.ZipEntry entry;
		
		        private  java.io.FileInputStream fis;
		        private  java.io.BufferedInputStream bis;
		
		        private  final int BUFFER_CAPACITY = 1024;
		        private  byte[] buffer;
		        private  int buffer_size;
		
		
		        public  boolean zipFile(java.io.File source, java.io.File target) {
			            boolean check = true;
			            try {
				                fos = new java.io.FileOutputStream(target);
				                zos = new java.util.zip.ZipOutputStream(fos);
				                zos.setMethod(java.util.zip.ZipOutputStream.DEFLATED);
				                zos.setLevel(java.util.zip.Deflater.DEFAULT_COMPRESSION);
				                bos = new java.io.BufferedOutputStream(zos);
				            } catch (java.io.IOException e) {
				                System.out.println("ZipperFF.zipFile() says: " + e);
				                check = false;
				            }
			            if (source.isDirectory()) {
				                buffer = new byte[BUFFER_CAPACITY];
				                if (manageFolder(source, ""))
				
				                    check = false;
				            } else {
				                buffer = new byte[BUFFER_CAPACITY];
				                if (writeFileToZipStream(source, ""))
				                    check = false;
				            }
			            try {
				                zos.finish();
				                bos.close();
				                zos.close();
				                fos.close();
				            } catch (Exception e) {
				                System.out.println("While closing streams (final), the following happend: " + e);
				            }
			            return true;
			        }
		
		        private  boolean manageFolder(java.io.File source_folder, String name) {
			            boolean check = true;
			            java.io.File[] all_files = source_folder.listFiles();
			            for (java.io.File single_file : all_files) {
				                if (single_file.isDirectory()) {
					                    manageFolder(single_file, name + java.io.File.separator + single_file.getName());
					                } else {
					                    if (!writeFileToZipStream(single_file, name +java.io.File.separator + single_file.getName()))
					                        check = false;
					                }
				            }
			            return check;
			        }
		
		        private  boolean writeFileToZipStream(java.io.File source_file, String entry_name) {
			            entry_name = entry_name.equals("") ? entry_name : entry_name.substring(1);
			            boolean check = true;
			            try {
				                fis = new java.io.FileInputStream(source_file);
				                bis = new java.io.BufferedInputStream(fis, BUFFER_CAPACITY);
				                entry = new java.util.zip.ZipEntry(entry_name.equals("") ? source_file.getName() : entry_name);
				                zos.putNextEntry(entry);
				                while ((buffer_size = bis.read(buffer, 0, BUFFER_CAPACITY)) != -1) {
					                    bos.write(buffer, 0, buffer_size);
					                }
				            } catch (java.io.IOException e) {
				                System.out.println("ZipperFF.writeFileToZipStream() says: " + e);
				                check = false;
				            }
			            try {
				                bos.flush();
				                zos.closeEntry();
				                bis.close();
				                fis.close();
				            } catch (java.io.IOException e) {
				                System.out.println("While closing streams (file), the following happend: " + e);
				            }
			            return check;
			        }
		    }
	    {
	}
	
	
	public void _MetrialRipper() {
		
	}
	public static class MaterialRippleLayout extends FrameLayout {
		    private static final int     DEFAULT_DURATION        = 350;
		    private static final int     DEFAULT_FADE_DURATION   = 75;
		    private static final float   DEFAULT_DIAMETER_DP     = 35;
		    private static final float   DEFAULT_ALPHA           = 0.2f;
		    private static final int     DEFAULT_COLOR           = Color.BLACK;
		    private static final int     DEFAULT_BACKGROUND      = Color.TRANSPARENT;
		    private static final boolean DEFAULT_HOVER           = true;
		    private static final boolean DEFAULT_DELAY_CLICK     = true;
		    private static final boolean DEFAULT_PERSISTENT      = false;
		    private static final boolean DEFAULT_SEARCH_ADAPTER  = false;
		    private static final boolean DEFAULT_RIPPLE_OVERLAY  = false;
		    private static final int     DEFAULT_ROUNDED_CORNERS = 0;
		    private static final int  FADE_EXTRA_DELAY = 50;
		    private static final long HOVER_DURATION   = 2500;
		    private final Paint paint  = new Paint(Paint.ANTI_ALIAS_FLAG);
		    private final Rect  bounds = new Rect();
		    private int      rippleColor;
		    private boolean  rippleOverlay;
		    private boolean  rippleHover;
		    private int      rippleDiameter;
		    private int      rippleDuration;
		    private int      rippleAlpha;
		    private boolean  rippleDelayClick;
		    private int      rippleFadeDuration;
		    private boolean  ripplePersistent;
		    private android.graphics.drawable.Drawable rippleBackground;
		    private boolean  rippleInAdapter;
		    private float    rippleRoundedCorners;
		    private float radius;
		    private AdapterView parentAdapter;
		    private View childView;
		    private AnimatorSet    rippleAnimator;
		    private ObjectAnimator hoverAnimator;
		    private Point currentCoords  = new Point();
		    private Point previousCoords = new Point();
		    private int layerType;
		    private boolean eventCancelled;
		    private boolean prepressed;
		    private int     positionInAdapter;
		    private GestureDetector   gestureDetector;
		    private PerformClickEvent pendingClickEvent;
		    private PressedEvent      pendingPressEvent;
		    public static RippleBuilder on(View view) {
			        return new RippleBuilder(view);
			    }
		    public MaterialRippleLayout(Context context) {
			        this(context, null, 0);
			    }
		    public MaterialRippleLayout(Context context, AttributeSet attrs) {
			        this(context, attrs, 0);
			    }
		    public MaterialRippleLayout(Context context, AttributeSet attrs, int defStyle) {
			        super(context, attrs, defStyle);
			        setWillNotDraw(false);
			        gestureDetector = new GestureDetector(context, longClickListener);
			        
			        rippleColor = DEFAULT_COLOR;
			        rippleDiameter =  (int) dpToPx(getResources(), DEFAULT_DIAMETER_DP);
			        rippleOverlay = DEFAULT_RIPPLE_OVERLAY;
			        rippleHover = DEFAULT_HOVER;
			        rippleDuration = DEFAULT_DURATION;
			        rippleAlpha = (int) (255 * DEFAULT_ALPHA);
			        rippleDelayClick = DEFAULT_DELAY_CLICK;
			        rippleFadeDuration = DEFAULT_FADE_DURATION;
			        rippleBackground = new android.graphics.drawable.ColorDrawable(DEFAULT_BACKGROUND);
			        ripplePersistent = DEFAULT_PERSISTENT;
			        rippleInAdapter = DEFAULT_SEARCH_ADAPTER;
			        rippleRoundedCorners = DEFAULT_ROUNDED_CORNERS;
			
			        paint.setColor(rippleColor);
			        paint.setAlpha(rippleAlpha);
			        enableClipPathSupportIfNecessary();
			    }
		    @SuppressWarnings("unchecked")
		    public <T extends View> T getChildView() {
			        return (T) childView;
			    }
		    @Override
		    public final void addView(View child, int index, ViewGroup.LayoutParams params) {
			        if (getChildCount() > 0) {
				            throw new IllegalStateException("MaterialRippleLayout can host only one child");
				        }
			        childView = child;
			        super.addView(child, index, params);
			    }
		    @Override
		    public void setOnClickListener(OnClickListener onClickListener) {
			        if (childView == null) {
				            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
				        }
			        childView.setOnClickListener(onClickListener);
			    }
		    @Override
		    public void setOnLongClickListener(OnLongClickListener onClickListener) {
			        if (childView == null) {
				            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
				        }
			        childView.setOnLongClickListener(onClickListener);
			    }
		    @Override
		    public boolean onInterceptTouchEvent(MotionEvent event) {
			        return !findClickableViewInChild(childView, (int) event.getX(), (int) event.getY());
			    }
		    @Override
		    public boolean onTouchEvent(MotionEvent event) {
			        boolean superOnTouchEvent = super.onTouchEvent(event);
			        if (!isEnabled() || !childView.isEnabled()) return superOnTouchEvent;
			        boolean isEventInBounds = bounds.contains((int) event.getX(), (int) event.getY());
			        if (isEventInBounds) {
				            previousCoords.set(currentCoords.x, currentCoords.y);
				            currentCoords.set((int) event.getX(), (int) event.getY());
				        }
			        boolean gestureResult = gestureDetector.onTouchEvent(event);
			        if (gestureResult || hasPerformedLongPress) {
				            return true;
				        } else {
				            int action = event.getActionMasked();
				            switch (action) {
					                case MotionEvent.ACTION_UP:
					                    pendingClickEvent = new PerformClickEvent();
					                    if (prepressed) {
						                        childView.setPressed(true);
						                        postDelayed(
						                            new Runnable() {
							                                @Override public void run() {
								                                    childView.setPressed(false);
								                                }
							                            }, ViewConfiguration.getPressedStateDuration());
						                    }
					                    if (isEventInBounds) {
						                        startRipple(pendingClickEvent);
						                    } else if (!rippleHover) {
						                        setRadius(0);
						                    }
					                    if (!rippleDelayClick && isEventInBounds) {
						                        pendingClickEvent.run();
						                    }
					                    cancelPressedEvent();
					                    break;
					                case MotionEvent.ACTION_DOWN:
					                    setPositionInAdapter();
					                    eventCancelled = false;
					                    pendingPressEvent = new PressedEvent(event);
					                    if (isInScrollingContainer()) {
						                        cancelPressedEvent();
						                        prepressed = true;
						                        postDelayed(pendingPressEvent, ViewConfiguration.getTapTimeout());
						                    } else {
						                        pendingPressEvent.run();
						                    }
					                    break;
					                case MotionEvent.ACTION_CANCEL:
					                    if (rippleInAdapter) {
						                        currentCoords.set(previousCoords.x, previousCoords.y);
						                        previousCoords = new Point();
						                    }
					                    childView.onTouchEvent(event);
					                    if (rippleHover) {
						                        if (!prepressed) {
							                            startRipple(null);
							                        }
						                    } else {
						                        childView.setPressed(false);
						                    }
					                    cancelPressedEvent();
					                    break;
					                case MotionEvent.ACTION_MOVE:
					                    if (rippleHover) {
						                        if (isEventInBounds && !eventCancelled) {
							                            invalidate();
							                        } else if (!isEventInBounds) {
							                            startRipple(null);
							                        }
						                    }
					                    if (!isEventInBounds) {
						                        cancelPressedEvent();
						                        if (hoverAnimator != null) {
							                            hoverAnimator.cancel();
							                        }
						                        childView.onTouchEvent(event);
						                        eventCancelled = true;
						                    }
					                    break;
					            }
				            return true;
				        }
			    }
		    private void cancelPressedEvent() {
			        if (pendingPressEvent != null) {
				            removeCallbacks(pendingPressEvent);
				            prepressed = false;
				        }
			    }
		    private boolean hasPerformedLongPress;
		    private android.view.GestureDetector.SimpleOnGestureListener longClickListener = new GestureDetector.SimpleOnGestureListener() {
			        public void onLongPress(MotionEvent e) {
				            hasPerformedLongPress = childView.performLongClick();
				            if (hasPerformedLongPress) {
					                if (rippleHover) {
						                    startRipple(null);
						                }
					                cancelPressedEvent();
					            }
				        }
			        @Override
			        public boolean onDown(MotionEvent e) {
				            hasPerformedLongPress = false;
				            return super.onDown(e);
				        }
			    };
		    private void startHover() {
			        if (eventCancelled) return;
			        if (hoverAnimator != null) {
				            hoverAnimator.cancel();
				        }
			        final float radius = (float) (Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2)) * 1.2f);
			        hoverAnimator = ObjectAnimator.ofFloat(this, radiusProperty, rippleDiameter, radius)
			            .setDuration(HOVER_DURATION);
			        hoverAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
			        hoverAnimator.start();
			    }
		    private void startRipple(final Runnable animationEndRunnable) {
			        if (eventCancelled) return;
			        float endRadius = getEndRadius();
			        cancelAnimations();
			        rippleAnimator = new AnimatorSet();
			        rippleAnimator.addListener(new AnimatorListenerAdapter() {
				            @Override public void onAnimationEnd(Animator animation) {
					                if (!ripplePersistent) {
						                    setRadius(0);
						                    setRippleAlpha(rippleAlpha);
						                }
					                if (animationEndRunnable != null && rippleDelayClick) {
						                    animationEndRunnable.run();
						                }
					                childView.setPressed(false);
					            }
				        });
			        ObjectAnimator ripple = ObjectAnimator.ofFloat(this, radiusProperty, radius, endRadius);
			        ripple.setDuration(rippleDuration);
			        ripple.setInterpolator(new android.view.animation.DecelerateInterpolator());
			        ObjectAnimator fade = ObjectAnimator.ofInt(this, circleAlphaProperty, rippleAlpha, 0);
			        fade.setDuration(rippleFadeDuration);
			        fade.setInterpolator(new android.view.animation.AccelerateInterpolator());
			        fade.setStartDelay(rippleDuration - rippleFadeDuration - FADE_EXTRA_DELAY);
			        if (ripplePersistent) {
				            rippleAnimator.play(ripple);
				        } else if (getRadius() > endRadius) {
				            fade.setStartDelay(0);
				            rippleAnimator.play(fade);
				        } else {
				            rippleAnimator.playTogether(ripple, fade);
				        }
			        rippleAnimator.start();
			    }
		    private void cancelAnimations() {
			        if (rippleAnimator != null) {
				            rippleAnimator.cancel();
				            rippleAnimator.removeAllListeners();
				        }
			        if (hoverAnimator != null) {
				            hoverAnimator.cancel();
				        }
			    }
		    private float getEndRadius() {
			        final int width = getWidth();
			        final int height = getHeight();
			        final int halfWidth = width / 2;
			        final int halfHeight = height / 2;
			        final float radiusX = halfWidth > currentCoords.x ? width - currentCoords.x : currentCoords.x;
			        final float radiusY = halfHeight > currentCoords.y ? height - currentCoords.y : currentCoords.y;
			        return (float) Math.sqrt(Math.pow(radiusX, 2) + Math.pow(radiusY, 2)) * 1.2f;
			    }
		    private boolean isInScrollingContainer() {
			        ViewParent p = getParent();
			        while (p != null && p instanceof ViewGroup) {
				            if (((ViewGroup) p).shouldDelayChildPressedState()) {
					                return true;
					            }
				            p = p.getParent();
				        }
			        return false;
			    }
		    private AdapterView findParentAdapterView() {
			        if (parentAdapter != null) {
				            return parentAdapter;
				        }
			        ViewParent current = getParent();
			        while (true) {
				            if (current instanceof AdapterView) {
					                parentAdapter = (AdapterView) current;
					                return parentAdapter;
					            } else {
					                try {
						                    current = current.getParent();
						                } catch (NullPointerException npe) {
						                    throw new RuntimeException("Could not find a parent AdapterView");
						                }
					            }
				        }
			    }
		    private void setPositionInAdapter() {
			        if (rippleInAdapter) {
				            positionInAdapter = findParentAdapterView().getPositionForView(MaterialRippleLayout.this);
				        }
			    }
		    private boolean adapterPositionChanged() {
			        if (rippleInAdapter) {
				            int newPosition = findParentAdapterView().getPositionForView(MaterialRippleLayout.this);
				            final boolean changed = newPosition != positionInAdapter;
				            positionInAdapter = newPosition;
				            if (changed) {
					                cancelPressedEvent();
					                cancelAnimations();
					                childView.setPressed(false);
					                setRadius(0);
					            }
				            return changed;
				        }
			        return false;
			    }
		    private boolean findClickableViewInChild(View view, int x, int y) {
			        if (view instanceof ViewGroup) {
				            ViewGroup viewGroup = (ViewGroup) view;
				            for (int i = 0; i < viewGroup.getChildCount(); i++) {
					                View child = viewGroup.getChildAt(i);
					                final Rect rect = new Rect();
					                child.getHitRect(rect);
					                final boolean contains = rect.contains(x, y);
					                if (contains) {
						                    return findClickableViewInChild(child, x - rect.left, y - rect.top);
						                }
					            }
				        } else if (view != childView) {
				            return (view.isEnabled() && (view.isClickable() || view.isLongClickable() || view.isFocusableInTouchMode()));
				        }
			        return view.isFocusableInTouchMode();
			    }
		    @Override
		    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
			        super.onSizeChanged(w, h, oldw, oldh);
			        bounds.set(0, 0, w, h);
			        rippleBackground.setBounds(bounds);
			    }
		    @Override
		    public boolean isInEditMode() {
			        return true;
			    }
		    @Override
		    public void draw(Canvas canvas) {
			        final boolean positionChanged = adapterPositionChanged();
			        if (rippleOverlay) {
				            if (!positionChanged) {
					                rippleBackground.draw(canvas);
					            }
				            super.draw(canvas);
				            if (!positionChanged) {
					                if (rippleRoundedCorners != 0) {
						                    Path clipPath = new Path();
						                    RectF rect = new RectF(0, 0, canvas.getWidth(), canvas.getHeight());
						                    clipPath.addRoundRect(rect, rippleRoundedCorners, rippleRoundedCorners, Path.Direction.CW);
						                    canvas.clipPath(clipPath);
						                }
					                canvas.drawCircle(currentCoords.x, currentCoords.y, radius, paint);
					            }
				        } else {
				            if (!positionChanged) {
					                rippleBackground.draw(canvas);
					                canvas.drawCircle(currentCoords.x, currentCoords.y, radius, paint);
					            }
				            super.draw(canvas);
				        }
			    }
		    private Property<MaterialRippleLayout, Float> radiusProperty
		        = new Property<MaterialRippleLayout, Float>(Float.class, "radius") {
			        @Override
			        public Float get(MaterialRippleLayout object) {
				            return object.getRadius();
				        }
			        @Override
			        public void set(MaterialRippleLayout object, Float value) {
				            object.setRadius(value);
				        }
			    };
		    private float getRadius() {
			        return radius;
			    }
		    public void setRadius(float radius) {
			        this.radius = radius;
			        invalidate();
			    }
		    private Property<MaterialRippleLayout, Integer> circleAlphaProperty
		        = new Property<MaterialRippleLayout, Integer>(Integer.class, "rippleAlpha") {
			        @Override
			        public Integer get(MaterialRippleLayout object) {
				            return object.getRippleAlpha();
				        }
			        @Override
			        public void set(MaterialRippleLayout object, Integer value) {
				            object.setRippleAlpha(value);
				        }
			    };
		    public int getRippleAlpha() {
			        return paint.getAlpha();
			    }
		    public void setRippleAlpha(Integer rippleAlpha) {
			        paint.setAlpha(rippleAlpha);
			        invalidate();
			    }
		    public void setRippleColor(int rippleColor) {
			        this.rippleColor = rippleColor;
			        paint.setColor(rippleColor);
			        paint.setAlpha(rippleAlpha);
			        invalidate();
			    }
		    public void setRippleOverlay(boolean rippleOverlay) {
			        this.rippleOverlay = rippleOverlay;
			    }
		    public void setRippleDiameter(int rippleDiameter) {
			        this.rippleDiameter = rippleDiameter;
			    }
		    public void setRippleDuration(int rippleDuration) {
			        this.rippleDuration = rippleDuration;
			    }
		    public void setRippleBackground(int color) {
			        rippleBackground = new android.graphics.drawable.ColorDrawable(color);
			        rippleBackground.setBounds(bounds);
			        invalidate();
			    }
		    public void setRippleHover(boolean rippleHover) {
			        this.rippleHover = rippleHover;
			    }
		    public void setRippleDelayClick(boolean rippleDelayClick) {
			        this.rippleDelayClick = rippleDelayClick;
			    }
		    public void setRippleFadeDuration(int rippleFadeDuration) {
			        this.rippleFadeDuration = rippleFadeDuration;
			    }
		    public void setRipplePersistent(boolean ripplePersistent) {
			        this.ripplePersistent = ripplePersistent;
			    }
		    public void setRippleInAdapter(boolean rippleInAdapter) {
			        this.rippleInAdapter = rippleInAdapter;
			    }
		    public void setRippleRoundedCorners(int rippleRoundedCorner) {
			        this.rippleRoundedCorners = rippleRoundedCorner;
			        enableClipPathSupportIfNecessary();
			    }
		    public void setDefaultRippleAlpha(float alpha) {
			        this.rippleAlpha = (int) (255 * alpha);
			        paint.setAlpha(rippleAlpha);
			        invalidate();
			    }
		    public void performRipple() {
			        currentCoords = new Point(getWidth() / 2, getHeight() / 2);
			        startRipple(null);
			    }
		    public void performRipple(Point anchor) {
			        currentCoords = new Point(anchor.x, anchor.y);
			        startRipple(null);
			    }
		    private void enableClipPathSupportIfNecessary() {
			        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.JELLY_BEAN_MR1) {
				            if (rippleRoundedCorners != 0) {
					                layerType = getLayerType();
					                setLayerType(LAYER_TYPE_SOFTWARE, null);
					            } else {
					                setLayerType(layerType, null);
					            }
				        }
			    }
		    private class PerformClickEvent implements Runnable {
			        @Override public void run() {
				            if (hasPerformedLongPress) return;
				            if (getParent() instanceof AdapterView) {
					                if (!childView.performClick())
					                    clickAdapterView((AdapterView) getParent());
					            } else if (rippleInAdapter) {
					                clickAdapterView(findParentAdapterView());
					            } else {
					                childView.performClick();
					            }
				        }
			        private void clickAdapterView(AdapterView parent) {
				            final int position = parent.getPositionForView(MaterialRippleLayout.this);
				            final long itemId = parent.getAdapter() != null
				                ? parent.getAdapter().getItemId(position)
				                : 0;
				            if (position != AdapterView.INVALID_POSITION) {
					                parent.performItemClick(MaterialRippleLayout.this, position, itemId);
					            }
				        }
			    }
		    private final class PressedEvent implements Runnable {
			        private final MotionEvent event;
			        public PressedEvent(MotionEvent event) {
				            this.event = event;
				        }
			        @Override
			        public void run() {
				            prepressed = false;
				            childView.setLongClickable(false);
				            childView.onTouchEvent(event);
				            childView.setPressed(true);
				            if (rippleHover) {
					                startHover();
					            }
				        }
			    }
		    static float dpToPx(android.content.res.Resources resources, float dp) {
			        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics());
			    }
		    public static class RippleBuilder {
			        private final Context context;
			        private final View    child;
			        private int     rippleColor         = DEFAULT_COLOR;
			        private boolean rippleOverlay       = DEFAULT_RIPPLE_OVERLAY;
			        private boolean rippleHover         = DEFAULT_HOVER;
			        private float   rippleDiameter      = DEFAULT_DIAMETER_DP;
			        private int     rippleDuration      = DEFAULT_DURATION;
			        private float   rippleAlpha         = DEFAULT_ALPHA;
			        private boolean rippleDelayClick    = DEFAULT_DELAY_CLICK;
			        private int     rippleFadeDuration  = DEFAULT_FADE_DURATION;
			        private boolean ripplePersistent    = DEFAULT_PERSISTENT;
			        private int     rippleBackground    = DEFAULT_BACKGROUND;
			        private boolean rippleSearchAdapter = DEFAULT_SEARCH_ADAPTER;
			        private float   rippleRoundedCorner = DEFAULT_ROUNDED_CORNERS;
			        public RippleBuilder(View child) {
				            this.child = child;
				            this.context = child.getContext();
				        }
			        public RippleBuilder rippleColor(int color) {
				            this.rippleColor = color;
				            return this;
				        }
			        public RippleBuilder rippleOverlay(boolean overlay) {
				            this.rippleOverlay = overlay;
				            return this;
				        }
			        public RippleBuilder rippleHover(boolean hover) {
				            this.rippleHover = hover;
				            return this;
				        }
			        public RippleBuilder rippleDiameterDp(int diameterDp) {
				            this.rippleDiameter = diameterDp;
				            return this;
				        }
			        public RippleBuilder rippleDuration(int duration) {
				            this.rippleDuration = duration;
				            return this;
				        }
			        public RippleBuilder rippleAlpha(float alpha) {
				            this.rippleAlpha = alpha;
				            return this;
				        }
			        public RippleBuilder rippleDelayClick(boolean delayClick) {
				            this.rippleDelayClick = delayClick;
				            return this;
				        }
			        public RippleBuilder rippleFadeDuration(int fadeDuration) {
				            this.rippleFadeDuration = fadeDuration;
				            return this;
				        }
			        public RippleBuilder ripplePersistent(boolean persistent) {
				            this.ripplePersistent = persistent;
				            return this;
				        }
			        public RippleBuilder rippleBackground(int color) {
				            this.rippleBackground = color;
				            return this;
				        }
			        public RippleBuilder rippleInAdapter(boolean inAdapter) {
				            this.rippleSearchAdapter = inAdapter;
				            return this;
				        }
			        public RippleBuilder rippleRoundedCorners(int radiusDp) {
				            this.rippleRoundedCorner = radiusDp;
				            return this;
				        }
			        public MaterialRippleLayout create() {
				            MaterialRippleLayout layout = new MaterialRippleLayout(context);
				            layout.setRippleColor(rippleColor);
				            layout.setDefaultRippleAlpha(rippleAlpha);
				            layout.setRippleDelayClick(rippleDelayClick);
				            layout.setRippleDiameter((int) dpToPx(context.getResources(), rippleDiameter));
				            layout.setRippleDuration(rippleDuration);
				            layout.setRippleFadeDuration(rippleFadeDuration);
				            layout.setRippleHover(rippleHover);
				            layout.setRipplePersistent(ripplePersistent);
				            layout.setRippleOverlay(rippleOverlay);
				            layout.setRippleBackground(rippleBackground);
				            layout.setRippleInAdapter(rippleSearchAdapter);
				            layout.setRippleRoundedCorners((int) dpToPx(context.getResources(), rippleRoundedCorner));
				            ViewGroup.LayoutParams params = child.getLayoutParams();
				            ViewGroup parent = (ViewGroup) child.getParent();
				            int index = 0;
				            if (parent != null && parent instanceof MaterialRippleLayout) {
					                throw new IllegalStateException("MaterialRippleLayout could not be created: parent of the view already is a MaterialRippleLayout");
					            }
				            if (parent != null) {
					                index = parent.indexOfChild(child);
					                parent.removeView(child);
					            }
				            layout.addView(child, new ViewGroup.LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.MATCH_PARENT));
				            if (parent != null) {
					                parent.addView(layout, index, params);
					            }
				            return layout;
				        }
			    }
	}
	{
	}
	
	
	public void _initShowOut(final View _v) {
		_v.setVisibility(View.GONE);
		_v.setTranslationY((float)(_v.getHeight()));
		_v.setAlpha((float)(0));
	}
	
	
	public void _ShowIn(final View _v) {
		_v.setVisibility(View.VISIBLE);
		_v.setTranslationY((float)(_v.getHeight()));
		_v.setAlpha((float)(0));
		_v.animate()
		.setDuration(200)
		.translationY(0)
		.setListener(new AnimatorListenerAdapter() {
				@Override
				public void onAnimationEnd(Animator animation) {
						super.onAnimationEnd(animation);
				}
		})
		.alpha(1f)
		.start();
		
	}
	
	
	public void _ShowOut(final View _v) {
		_v.setVisibility(View.VISIBLE);
		_v.setTranslationY((float)(0));
		_v.setAlpha((float)(1));
		_v.animate()
		.setDuration(200)
		.translationY(_v.getHeight())
		.setListener(new AnimatorListenerAdapter() {
				@Override
				public void onAnimationEnd(Animator animation) {
						_v.setVisibility(View.GONE);
						super.onAnimationEnd(animation);
				}
		}).alpha(0f)
		.start();
		
	}
	
	
	public void _deletTask(final double _pos, final String _path, final ArrayList<HashMap<String, Object>> _mp1) {
		prodel.setTitle("حذف کردن فایل");
		prodel.setCanceledOnTouchOutside(false);
		prodel.setCancelable(false);
		while(true) {
			try{
				FileUtil.deleteFile(_mp1.get((int)_pos).get(_path).toString());
				_getFiles("");
				prodel.show();
			}catch(Exception e){
				SketchwareUtil.showMessage(getApplicationContext(), "Error");
			}
			prodel.dismiss();
			break;
		}
	}
	
	
	public void _clickAnimation(final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	public void _renameFile(final String _dir, final String _oldName, final String _newName) {
		File dir = new File(_dir.substring((int)(0), (int)_dir.lastIndexOf("/")));
		 if(dir.exists()){
			        File from = new File(dir,_oldName);
			        File to = new File(dir,_newName);
			         if(from.exists())
			            from.renameTo(to);
			    }
	}
	
	
	public void _isShowDialogRanme() {
		try {
			                   index = files.size() - 1;
			for(int _repeat152 = 0; _repeat152 < (int)(files.size()); _repeat152++) {
				listStringShareFile.add(files.get((int)index).get("path").toString());
				if (files.get((int)index).get("sel").toString().equals("true")) {
					final AlertDialog dialog1 = new AlertDialog.Builder(FiledirActivity.this).create();
					View inflate = getLayoutInflater().inflate(R.layout.raname,null); 
					dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
					dialog1.setView(inflate);
					final EditText editor = (EditText) inflate.findViewById(R.id.editor);
					final TextView msg = (TextView) inflate.findViewById(R.id.msg);
					final LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
					final TextView ok = (TextView) inflate.findViewById(R.id.ok);
					final TextView miss = (TextView) inflate.findViewById(R.id.miss);
					final com.google.android.material.textfield.TextInputLayout inputtext = (com.google.android.material.textfield.TextInputLayout) inflate.findViewById(R.id.inputtext);
					msg.setText("Rename file".concat("\nSelected folders/files:"));
					index = files.size() - 1;
					editor.setText(Uri.parse(listStringShareFile.get((int)(index))).getLastPathSegment());
					editor.setSelection((int)editor.getText().length());
					///result code By Ninja coder.ir my love java
					
					
					GradientDrawable hsi1 = new GradientDrawable();
							hsi1.setColor(0xFF1F1B1C);
							hsi1.setCornerRadius(25);
							hsi1.setStroke(1, 0xFFFDA893);
					for (int _pos = ((int) files.size() - 1); _pos > -1; _pos--) {
							 msg.append(" ".concat(Uri.parse(listStringShareFile.get((int)(_pos))).getLastPathSegment()).concat(" "));
					}
					inputtext.setBoxBackgroundColor(0xFF151213);
					inputtext.setBoxStrokeColor(0xFFFDA893);
					inputtext.setBoxCornerRadii((float)10, (float)10, (float)10, (float)10);
					if (inputtext.getCounterMaxLength() == 100) {
						inputtext.setCounterTextColor(ColorStateList.valueOf(0xFFFDA893));
						inputtext.setErrorEnabled(false);
					}
					else {
						inputtext.setErrorEnabled(true);
						inputtext.setError("استفاده بیش حد مجاز");
						inputtext.setCounterTextColor(ColorStateList.valueOf(0xFFF44336));
					}
					inputtext.setCounterEnabled(true);
					inputtext.setCounterTextColor(ColorStateList.valueOf(0xFFFDA893));
					bg.setBackgroundColor(0xFF1F1B1C);
					ok.setOnClickListener(v->{
							
						
							 if (index == 0) {
							_renameFile(listStringShareFile.get((int)(index)), Uri.parse(listStringShareFile.get((int)(index))).getLastPathSegment(), editor.getText().toString());
							listStringShareFile.clear();
							_getFiles("");
							 .dismiss();
						}
						else {
							_renameFile(listStringShareFile.get((int)(index)), Uri.parse(listStringShareFile.get((int)(index))).getLastPathSegment(), editor.getText().toString());
							index--;
							editor.setText(Uri.parse(listStringShareFile.get((int)(index))).getLastPathSegment());
							editor.setSelection((int)editor.getText().length());
							_getFiles("");
						}
					});
					miss.setOnClickListener(v->{
							
						
							 conter = 0;
						listStringShareFile.clear();
						_getFiles("");
						 .dismiss();
					});
					dialog1.show();
				}
				index--;
			}
			_getFiles("");
				} catch (Exception exception) {
			final var mm = new GradientDrawable();
						mm.setColor(Color.parseColor("#192730"));
						mm.setStroke(1, Color.parseColor("#CDE8F9"));
						mm.setCornerRadius(21f);
						final var malterDialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
						malterDialog.setTitle("Error");
			         malterDialog.setBackground(mm);
						StringBuffer sb = new StringBuffer(500);
						StackTraceElement[] st = exception.getStackTrace();
						sb.append(exception.getClass().getName() + " : " + exception.getMessage() + "\n");
						for (int iii = 0; iii < st.length; iii++) {
								sb.append("\t at ⟶" + st[iii].toString() + "\n");
						}
			
						final LinearLayout linearLayout = new LinearLayout(getApplicationContext());
			
						linearLayout.setPadding(8, 8, 8, 8);
			
						final TextView mtextView = new TextView(getApplicationContext());
			
						mtextView.setPadding(8, 8, 8, 8);
			              mtextView.setTextColor(Color.parseColor("#FFFFCE9A"));;
			
						mtextView.setTextIsSelectable(true);
			
						linearLayout.addView(mtextView);
			
						mtextView.setText(sb.toString());
			
						{
								SpannableString spannableString = new SpannableString(mtextView.getText().toString());
								Matcher matcher = Pattern.compile("(^(.*)|(?<=:)\\d+)").matcher(mtextView.getText().toString());
				
								while (matcher.find()) {
					
										spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFFF9A9A")), matcher.start(), matcher.end(),
												Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
										spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 33);
					
								}
				
								mtextView.setText(spannableString);
						}
			          malterDialog.setNegativeButton("Dismiss",(Dialog,iii) -> {
								
						});
						malterDialog.setView(linearLayout);
						malterDialog.show();
				}
	}
	
	
	public void _getSetItem10() {
		index = files.size() - 1;
		for(int _repeat13 = 0; _repeat13 < (int)(files.size()); _repeat13++) {
			if (files.get((int)index).get("sel").toString().equals("true")) {
				listStringShareFile.add(files.get((int)index).get("path").toString());
			}
			index--;
		}
	}
	
	
	public void _TryunZipProject(final String _getInput, final String _getOutput, final String _Title, final String _Massges) {
		////NinjaUnziper.unziper(this,_Title,_Massges,_getInput,_getOutput);
		GradientDrawable back = new GradientDrawable();
		back.setColor(0xFF1F1B1C);
		back.setCornerRadius(25);
		back.setStroke(2, 0xFFFDA893);
		progressDialog = new ProgressDialog(this, ProgressDialog.THEME_DEVICE_DEFAULT_DARK);
		progressDialog.setMessage(_Massges);
		progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		progressDialog.setTitle(_Title);
		progressDialog.getWindow().setBackgroundDrawable(back);
		Thread thread = new Thread(() -> {
				
				FileInputStream fis = null;
				ZipInputStream zis = null;
				try {
						runOnUiThread(() -> {
								
								progressDialog.show();
								
						});
						File source = new File(_getInput);
						File target = new File(_getOutput);
						byte[] buffer = new byte[4 * 1024];
						target.mkdirs();
						fis = new FileInputStream(source);
						zis = new ZipInputStream(fis);
						ZipEntry ze = zis.getNextEntry();
						final int length = new ZipFile(source).size();
						int counter = 0;
						while (ze != null) {
								String fileName = ze.getName();
								File newFile = new File(target + File.separator + fileName);
								if (fileName.endsWith("/")) {
										newFile.mkdirs();
										zis.closeEntry();
										ze = zis.getNextEntry();
										continue;
								}
								
								File parent = newFile.getParentFile();
								if (parent != null)
								parent.mkdirs();
								
								FileOutputStream fos = new FileOutputStream(newFile);
								int len;
								while ((len = zis.read(buffer)) > 0)
								fos.write(buffer, 0, len);
								fos.close();
								zis.closeEntry();
								ze = zis.getNextEntry();
								counter++;
								
								final double fi = (double) counter;
								runOnUiThread(() -> {
										
										progressDialog.setProgress((int) ((fi / length) * 100));
										
								});
						}
						
				} catch (IOException e) {
						e.printStackTrace();
				} finally {
						try {
								if (fis != null)
								fis.close();
								if (zis != null) {
										zis.closeEntry();
										zis.close();
								}
						} catch (IOException e) {
								e.printStackTrace();
						}
						
						runOnUiThread(() -> {
								
								progressDialog.dismiss();
								_getFiles("");
								
						});
				}
				
		});
		thread.start();
		
		
	}
	
	
	public void _taskDelet(final String _input) {
		prodel.setTitle("حذف کردن فایل");
		prodel.setCanceledOnTouchOutside(false);
		prodel.setMessage(_input);
		prodel.setCancelable(false);
		prodel.show();
		new Thread(new Runnable() {
			@Override
			public void run() {
				Looper.prepare();
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						try{
							FileUtil.deleteFile(_input);
						}catch(Exception e){
							SketchwareUtil.showMessage(getApplicationContext(), e.toString());
						}
					}
				});
				
				
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						
						
						_getFiles("");
						prodel.dismiss();
						
						Looper.loop();
					} 
					
				});
			}
		}).start();
		
		
	}
	
	
	public String _VideoWhich(final String _path) {
		MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
		        mediaMetadataRetriever.setDataSource(_path);
		        return mediaMetadataRetriever.extractMetadata(18);
	}
	
	
	public String _Videohighlights(final String _path) {
		MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
		        mediaMetadataRetriever.setDataSource(_path);
		        return mediaMetadataRetriever.extractMetadata(19);
	}
	
	
	public void _pngtotiff(final String _input, final String _output) {
		org.beyka.tiffbitmapfactory.IProgressListener progressListener = new org.beyka.tiffbitmapfactory.IProgressListener() {
				@Override
				public void reportProgress(long processedPixels, long totalPixels) {
						
				           _getFiles("");
				      
				}
		};
		
		org.beyka.tiffbitmapfactory.TiffConverter.ConverterOptions options = new TiffConverter.ConverterOptions();
		options.throwExceptions = false; //Set to true if you want use java exception mechanism;
		options.availableMemory = 128 * 1024 * 1024; //Available 128Mb for work;
		options.compressionScheme = org.beyka.tiffbitmapfactory.CompressionScheme.LZW; //compression scheme for tiff
		options.appendTiff = false;//If set to true - will be created one more tiff directory, otherwise file will be overwritten
		org.beyka.tiffbitmapfactory.TiffConverter.convertToTiff(_input, _output, options, progressListener);
		
	}
	
	
	public void _mp4Image(final String _path, final ImageView _pic2) {
		Bitmap thumb = android.media.ThumbnailUtils.createVideoThumbnail(_path, android.provider.MediaStore.Images.Thumbnails.MINI_KIND);
		final GradientDrawable gradientDrawable = new GradientDrawable();
		gradientDrawable.setColor(Color.BLUE);
		gradientDrawable.setStroke(1,ColorStateList.valueOf(Color.DKGRAY));
		gradientDrawable.setCornerRadius(20);
		Glide.with(getApplicationContext())
		.load(thumb)
		.placeholder(gradientDrawable)
		.error(gradientDrawable)
		.into(_pic2);
	}
	
	
	public void _startConvert(final String _str) {
		org.beyka.tiffbitmapfactory.IProgressListener progressListener = new org.beyka.tiffbitmapfactory.IProgressListener() {
				@Override
				public void reportProgress(long processedPixels, long totalPixels) {
						
				            
				      
				}
		};
		///result code By Ninja coder.ir my love java
		
		
		GradientDrawable gt = new GradientDrawable();
				gt.setColor(0xFF1C1B20);
				gt.setCornerRadius(25);
				gt.setStroke(1, 0xFFFDA893);
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
		    di.setTitle("تغییر دهنده فرمت");
		di.setMessage("لطفا نوع تغییر را مشخص کنید");
		di.setNeutralButton("to png", (p, d) -> {
			
			         TiffConverter.ConverterOptions OtherTiff = new TiffConverter.ConverterOptions();
					OtherTiff.throwExceptions = false;
					OtherTiff.availableMemory = 128 * 1024 * 1024; 
					OtherTiff.readTiffDirectory = 1; 
			       TiffConverter.convertTiffPng(_str, _str.replace(".tiff", ".png"), OtherTiff, progressListener);
			_getFiles("");
			
						});
		di.setPositiveButton("to bmp", (p1, d2) -> {
			
			         TiffConverter.ConverterOptions OtherTiff = new TiffConverter.ConverterOptions();
					OtherTiff.throwExceptions = false;
					OtherTiff.availableMemory = 128 * 1024 * 1024; 
					OtherTiff.readTiffDirectory = 1; 
			       TiffConverter.convertTiffBmp(_str, _str.replace(".tiff", ".bmp"), OtherTiff, progressListener);
			_getFiles("");
			
						});
		di.setNegativeButton("to jpg", (p3, d3) -> {
			
			         TiffConverter.ConverterOptions OtherTiff = new TiffConverter.ConverterOptions();
					OtherTiff.throwExceptions = false;
					OtherTiff.availableMemory = 128 * 1024 * 1024; 
					OtherTiff.readTiffDirectory = 1; 
			       TiffConverter.convertTiffJpg(_str, _str.replace(".tiff", ".bmp"), OtherTiff, progressListener);
			_getFiles("");
			
						});
		di.setBackground(gt);
		di.show();
		
		
		
		
	}
	
	
	public void _DecompressAssterUnzip(final String _input, final String _output) {
		Decompress.unzipFromAssets(this,_input,_output);
	}
	
	
	public void _project() {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.projects)
		.setTitle("Make project")
		.setMessage("type name project and setLibrary ")
		.setCancelable(true)
		.setIcon(R.drawable.web)
		.setPositiveButton("make project", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       EditText editor = dialog.findViewById(R.id.editor);		
			
			com.google.android.material.checkbox.MaterialCheckBox ch = dialog.findViewById(R.id.ch);		
			
			com.google.android.material.checkbox.MaterialCheckBox ch2 = dialog.findViewById(R.id.ch2);		
			
			com.google.android.material.checkbox.MaterialCheckBox ch3 = dialog.findViewById(R.id.ch3);		
			
			com.google.android.material.checkbox.MaterialCheckBox ch4 = dialog.findViewById(R.id.ch4);		
			
			com.google.android.material.textfield.TextInputLayout te = dialog.findViewById(R.id.te);		
			
			HorizontalScrollView hs = dialog.findViewById(R.id.hs);		
			
			Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			if (editor.getText().toString().isEmpty()) {
				positive.setEnabled(false);
				te.setEndIconVisible(false);
			}
			else {
				positive.setEnabled(true);
				te.setEndIconVisible(true);
			}
			editor.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (editor.getText().toString().isEmpty()) {
						positive.setEnabled(false);
						te.setEndIconVisible(false);
					}
					else {
						te.setEndIconVisible(true);
						positive.setEnabled(true);
					}
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
			hs.setHorizontalScrollBarEnabled(false);
			hs.setVerticalScrollBarEnabled(false);
			hs.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
			te.setCounterTextColor(ColorStateList.valueOf(Color.parseColor("#FFF8B09A")));
			te.setCounterEnabled(true);
			te.setCounterMaxLength(100);
			te.setEndIconDrawable(R.drawable.closehsi);
			te.setEndIconVisible(false);
			te.setEndIconOnClickListener(v ->{
							
							editor.setText("");
				
					});
			positive.setOnClickListener((vftrororocjj) -> {
				
				             dialog.dismiss();
				SketchwareUtil.hideKeyboard(getApplicationContext());
				if (editor.getText().toString().isEmpty()) {
					SketchwareUtil.showMessage(getApplicationContext(), "نام پروژه را وارد کنید");
				}
				else {
					if (ch.isChecked() || (ch2.isChecked() || (ch3.isChecked() || ch4.isChecked()))) {
						FileUtil.makeDir(GetTab.concat("/".concat(editor.getText().toString())));
						_TaskProjectInstallProgessDialog("project.zip", GetTab.concat("/".concat(editor.getText().toString())));
						_getFiles("");
					}
					else {
						FileUtil.makeDir(GetTab.concat("/"));
						_TaskProjectInstallProgessDialog("project.zip", GetTab);
						_getFiles("");
					}
					ask = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									if (ch.isChecked()) {
										_TaskProjectInstallProgessDialog("bootstrap5.2.2.zip", GetTab.concat("/".concat(editor.getText().toString())));
										_getFiles("");
									}
									else {
										
									}
									if (ch2.isChecked()) {
										_TaskProjectInstallProgessDialog("kotlin1.7.20.zip", GetTab.concat("/".concat(editor.getText().toString())));
										_getFiles("");
									}
									else {
										
									}
									if (ch3.isChecked()) {
										_TaskProjectInstallProgessDialog("typescript4.8.4.zip", GetTab.concat("/".concat(editor.getText().toString())));
										_getFiles("");
									}
									else {
										
									}
									if (ch4.isChecked()) {
										_TaskProjectInstallProgessDialog("angular9.1.13.zip", GetTab.concat("/".concat(editor.getText().toString())));
										_getFiles("");
									}
									else {
										
									}
								}
							});
						}
					};
					_timer.schedule(ask, (int)(900));
				}
				_getFiles("");
								
						});
		});
		dialog.show();
	}
	
	
	public void _TaskProjectInstallProgessDialog(final String _getInput, final String _getOutput) {
		new AsyncTask<String, String, String>() {
			@Override
			protected void onPreExecute() {
				unzip.setTitle("installLibrary");
				unzip.setMessage("Task Runing Install LocalLibrary...");
				unzip.show();
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				_DecompressAssterUnzip(_getInput, _getOutput);
				return "";
			}
			@Override
			protected void onPostExecute(String _result) {
				unzip.dismiss();
			}
		}.execute("");
	}
	
	
	public void _absolot() {
		if (war.getString("val", "").equals("true")) {
			
				Drawable drawable = WallpaperManager.getInstance(FiledirActivity.this).getDrawable();
				if (drawable != null) {
						linear1.setBackgroundDrawable(drawable);
				}
			
			
		}
		else {
			if (war.getString("val", "").equals("false")) {
				linear1.setBackgroundColor(0xFF1F1B1C);
			}
			else {
				
			}
		}
	}
	
	
	public void _extra() {
	}
	public Context _getMyContext(Context c) {
			return c;
	}
	public Context _getMyContext(Fragment f) {
			return f.getActivity();
	}
	public Context _getMyContext(DialogFragment df) {
			return df.getActivity();
	}
	{
			
	}
	
	
	public void _installGithub() {
		{
				try{
						int count;
						java.io.InputStream input= this._getMyContext(this).getAssets().open("core-lambda-stubs.jar");
						java.io.OutputStream output = new  java.io.FileOutputStream("/storage/emulated/0/GhostWebIDE/android".concat("/class_path.jar"));
						byte data[] = new byte[1024];
						while ((count = input.read(data))>0) {
								output.write(data, 0, count);
						}
						output.flush();
						output.close();
						input.close();
						
				}catch(Exception e){
						
				}
		}
		{
				
		}
		
		{
				new mod.hey.studios.project.library.LibraryDownloader(this._getMyContext(this), true ,"/sdcard/GhostWebIde/" , "/storage/emulated/0/GhostWebIDE/android/android.jar" , "/storage/emulated/0/GhostWebIDE/android".concat("/class_path.jar")).showDialog(new LibraryDownloader.OnCompleteListener() {
						
						@Override
						public void onComplete() {
								SketchwareUtil.showMessage(getApplicationContext(), "done 100%");
					            _getFiles("");
						}
				});
		}
		
	}
	
	
	public void _tarview(final double _pos, final String _path, final ArrayList<HashMap<String, Object>> _map) {
		if (_map.get((int)_pos).get(_path).toString().endsWith(".tar")) {
			///result code By Ninja coder.ir my love java
			
			
			GradientDrawable dis = new GradientDrawable();
					dis.setColor(0xFF1F1B1C);
					dis.setCornerRadius(25);
					dis.setStroke(1, 0xFFFDA893);
			var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
			    di.setTitle("مشاهده گر فایل فشرده");
			di.setMessage("برای مشاهده یا استخراج یکی از گزینه های زیرا انتخاب کنید دقت کنید که در محل فعلی فایل ها استخراج میشن");
			di.setNeutralButton("مشاهده", (p, d) -> {
				
				         void10.setClass(getApplicationContext(), ZipshowActivity.class);
				void10.putExtra("zipview", _map.get((int)_pos).get(_path).toString());
				startActivity(void10);
				
							});
			di.setPositiveButton("استخراج", (p1, d2) -> {
				
				         new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						unzip.setTitle("در حال استخراج ممکن است چند دقیقه طول بکشد ");
						unzip.setMessage("استخراج ".concat(Uri.parse(_map.get((int)_pos).get(_path).toString()).getLastPathSegment()));
						unzip.show();
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						try{
							String fileZip = _map.get((int)_pos).get(_path).toString();
							        java.io.File destDir = new java.io.File(GetTab);
							        byte[]  buffer = new byte[1024] ;
							        try {
								        java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(fileZip));
								        java.util.zip.ZipEntry zipEntry = zis.getNextEntry();
								
								
								        while (zipEntry != null) {
									             java.io.File newFile = newFile(destDir, zipEntry);
									             if (zipEntry.isDirectory()) {
										                 if (!newFile.isDirectory() && !newFile.mkdirs()) {
											                     throw new java.io.IOException("Failed to create directory " + newFile);
											                 }
										             } else {
										                 // fix for Windows-created archives
										                 java.io.File parent = newFile.getParentFile();
										                 if (!parent.isDirectory() && !parent.mkdirs()) {
											                     throw new java.io.IOException("Failed to create directory " + parent);
											                 }
										
										                 // write file content
										                 java.io.FileOutputStream fos = new java.io.FileOutputStream(newFile);
										                 int len;
										                 while ((len = zis.read(buffer)) > 0) {
											                     fos.write(buffer, 0, len);
											                 }
										                 fos.close();
										             }
									         zipEntry = zis.getNextEntry();
									        }
								        zis.closeEntry();
								        zis.close();
							} catch (Exception e) {
								  showMessage(e.toString());
								   }
						}catch(Exception e){
							SketchwareUtil.showMessage(getApplicationContext(), "Error => ".concat(e.toString()));
						}
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						unzip.dismiss();
						_getFiles("");
					}
				}.execute("");
				
							});
			di.setBackground(dis);
			di.show();
			
			
			
			
		}
	}
	
	
	public void _zipviewandexsert(final double _pos, final String _path, final ArrayList<HashMap<String, Object>> _map) {
		if (_map.get((int)_pos).get(_path).toString().endsWith(".zip")) {
			var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
			    di.setTitle("مشاهده گر فایل فشرده");
			di.setMessage("برای مشاهده یا استخراج یکی از گزینه های زیرا انتخاب کنید دقت کنید که در محل فعلی فایل ها استخراج میشن");
			di.setNeutralButton("مشاهده", (p, d) -> {
				
				         intgetTheme.setClass(getApplicationContext(), ZipshowActivity.class);
				intgetTheme.putExtra("zipview", _map.get((int)_pos).get(_path).toString());
				startActivity(intgetTheme);
				
							});
			di.setPositiveButton("استخراج", (p1, d2) -> {
				
				         new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						unzip.setTitle("در حال استخراج ممکن است چند دقیقه طول بکشد ");
						unzip.setMessage("استخراج ".concat(Uri.parse(_map.get((int)_pos).get(_path).toString()).getLastPathSegment()));
						unzip.show();
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						try{
							String fileZip = _map.get((int)_pos).get(_path).toString();
							        java.io.File destDir = new java.io.File(GetTab);
							        byte[]  buffer = new byte[1024] ;
							        try {
								        java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(fileZip));
								        java.util.zip.ZipEntry zipEntry = zis.getNextEntry();
								
								
								        while (zipEntry != null) {
									             java.io.File newFile = newFile(destDir, zipEntry);
									             if (zipEntry.isDirectory()) {
										                 if (!newFile.isDirectory() && !newFile.mkdirs()) {
											                     throw new java.io.IOException("Failed to create directory " + newFile);
											                 }
										             } else {
										                 // fix for Windows-created archives
										                 java.io.File parent = newFile.getParentFile();
										                 if (!parent.isDirectory() && !parent.mkdirs()) {
											                     throw new java.io.IOException("Failed to create directory " + parent);
											                 }
										
										                 // write file content
										                 java.io.FileOutputStream fos = new java.io.FileOutputStream(newFile);
										                 int len;
										                 while ((len = zis.read(buffer)) > 0) {
											                     fos.write(buffer, 0, len);
											                 }
										                 fos.close();
										             }
									         zipEntry = zis.getNextEntry();
									        }
								        zis.closeEntry();
								        zis.close();
							} catch (Exception e) {
								  showMessage(e.toString());
								   }
						}catch(Exception e){
							SketchwareUtil.showMessage(getApplicationContext(), "Error => ".concat(e.toString()));
						}
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						unzip.dismiss();
						_getFiles("");
					}
				}.execute("");
				
							});
			di.show();
			
			
			
			
		}
	}
	
	
	public void _ImageFastShow(final String _input, final ImageView _img) {
		SvgShow.ImageShowFormFile(getApplicationContext(),_input,_img);
	}
	
	
	public void _gogo(final String _input, final ImageView _img, final TextView _tv) {
		try{
			SvgShow.GetFileSvg(_input,_img,this,_tv);
		}catch(Exception e){
			 
		}
	}
	
	
	public void _adptor() {
	}
	public class MyListViewListAdapter extends BaseAdapter {
				
				ArrayList<HashMap<String, Object>> _data;
				
				public MyListViewListAdapter(ArrayList<HashMap<String, Object>> _arr) {
						_data = _arr;
				}
				
				@Override
				public int getCount() {
						return _data.size();
				}
				
				@Override
				public HashMap<String, Object> getItem(int _index) {
						return _data.get(_index);
				}
				
				@Override
				public long getItemId(int _index) {
						return _index;
				}
				
				@Override
				public View getView(final int _position, View _v, ViewGroup _container) {
						LayoutInflater _inflater = getLayoutInflater();
						View _view = _v;
						if (_view == null) {
								_view = _inflater.inflate(R.layout.getlist, null);
						}
						
			
						
			       
			      final TextView tv = _view.findViewById(R.id.tv);
			final ImageView img = _view.findViewById(R.id.img);
			final LinearLayout lps = _view.findViewById(R.id.lps);
			if (_position == 0) {
				img.setImageResource(R.drawable.cog);
				tv.setText(getResources().getString(R.string.sting));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 1) {
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
				img.setImageResource(R.drawable.javanull);
				tv.setText(getResources().getString(R.string.java));
			}
			if (_position == 2) {
				img.setImageResource(R.drawable.googleplay);
				tv.setText(getResources().getString(R.string.googleplay));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 3) {
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
				img.setImageResource(R.drawable.console);
				tv.setText(getResources().getString(R.string.ter));
			}
			if (_position == 4) {
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
				if (staticStorage) {
					staticStorage = true;
					img.setImageResource(R.drawable.folderhome);
					tv.setText(getResources().getString(R.string.sdcard2));
				}
				else {
					img.setImageResource(R.drawable.sdcard);
					tv.setText(getResources().getString(R.string.sdcard1));
					staticStorage = false;
				}
			}
			if (_position == 5) {
				img.setImageResource(R.drawable.information);
				tv.setText(getResources().getString(R.string.about));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 6) {
				img.setImageResource(R.drawable.school);
				tv.setText(getResources().getString(R.string.htmlle));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 7) {
				img.setImageResource(R.drawable.keyboard);
				tv.setText(getResources().getString(R.string.keyboard));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 8) {
				img.setImageResource(R.drawable.keyboardlisnertalluserpost_1);
				tv.setText(getResources().getString(R.string.up));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 9) {
				img.setImageResource(R.drawable.keyboardlisnertalluserpost_2);
				tv.setText(getResources().getString(R.string.themebackoup));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 10) {
				img.setImageResource(R.drawable.log);
				tv.setText(getResources().getString(R.string.logcater));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
			if (_position == 11) {
				img.setImageResource(R.drawable.iconmode);
				tv.setText(getResources().getString(R.string.geticonmod));
			}
			if (_position == 12) {
				img.setImageResource(R.drawable.exit);
				tv.setText(getResources().getString(R.string.exitapp));
				img.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			}
						
						return _view;
				}
		}
	
	{
	}
	
	
	public void _lojiceinstallK() {
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
		    di.setTitle("کیبورد");
		di.setMessage("دقت کنید اگر گزینه انتخاب کیبورد را نزدید ابتدا کیبورد را انتخاب کنید سپس تایید کنید با تشکر");
		di.setNeutralButton("انتخاب کیبورد", (p, d) -> {
			
			         	Intent i = new Intent("android.settings.INPUT_METHOD_SETTINGS");
								startActivity(i);
			///انتخاب کیبورد
			
						});
		di.setPositiveButton("تایید کیبورد", (p1, d2) -> {
			
			         try{
					InputMethodManager i = (InputMethodManager) getSystemService("input_method");
									i.showInputMethodPicker();
			}catch(Exception e){
					e.printStackTrace();
			}
			  ///تایید کیبورد
			
						});
		di.show();
		
		
		
		
	}
	
	
	public void _prots(final String _input, final ImageView _img, final TextView _tv) {
		File file = new File(_input);
		
		//Read data about image to Options object
		TiffBitmapFactory.Options options = new TiffBitmapFactory.Options();
		options.inJustDecodeBounds = true;
		TiffBitmapFactory.decodeFile(file, options);
		
		int dirCount = options.outDirectoryCount;
		
		//Read and process all images in file
		for (int i = 0; i < dirCount; i++) {
				options.inDirectoryNumber = i;
				TiffBitmapFactory.decodeFile(file, options);
				int curDir = options.outCurDirectoryNumber;
				int width = options.outWidth;
				int height = options.outHeight;
				//Change sample size if width or height bigger than required width or height
				int inSampleSize = 1;
				
				options.inJustDecodeBounds = false;
				options.inSampleSize = inSampleSize;
				
				// Specify the amount of memory available for the final bitmap and temporary storage.
				options.inAvailableMemory = 20000000; // bytes
				
				Bitmap bmp = TiffBitmapFactory.decodeFile(file, options);
				//(bmp);
				final GradientDrawable gradientDrawable = new GradientDrawable();
				gradientDrawable.setColor(0xFF1F1B1C);
				gradientDrawable.setStroke(1,ColorStateList.valueOf(Color.parseColor("#FFFFB49D")));
				gradientDrawable.setCornerRadius(20);
				Glide.with(getApplicationContext())
				.load(bmp)
				.placeholder(gradientDrawable)
				.error(gradientDrawable)
				.circleCrop()
				.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
				.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
				.priority(Priority.HIGH)
				.into(_img);
				_tv.setText(String.valueOf((long) width) + " x " + String.valueOf((long) height));
		}
		
	}
	
	
	public void _fontpost(final ArrayList<HashMap<String, Object>> _map, final String _path, final double _pos) {
		if (_map.get((int)_pos).get(_path).toString().endsWith(".ttf") || _map.get((int)_pos).get(_path).toString().endsWith(".otf")) {
			finalintentpostfont.setClass(getApplicationContext(), FontviewActivity.class);
			finalintentpostfont.putExtra("font", _map.get((int)_pos).get(_path).toString());
			startActivity(finalintentpostfont);
		}
	}
	
	
	public void _colorpost(final TextView _textview1) {
		com.neo.highlight.core.Highlight highlight = new com.neo.highlight.core.Highlight();
		
		//add Schemes
		
		highlight.addScheme(
		
		         new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.html"),0xFF00BCD4
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.py"),0xFFFFEB3B
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.cpp{1}"),0xFFE91E63
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.c"),0xFF795548
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.css{1}"),0xFF2196F3
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.swift"),0xFFFF9800
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.go"),0xFF3F51B5
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.php"),0xFF9C27B0
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\bGhostWebIDE"),0xFF009688
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.rb"),0xFFF44336
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.js"),0xFF3F51B5
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.rbw"),0xFFC62828
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.ghost"),0xFFE0E0E0
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.java"),0xFFFFC107
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.cs"),0xFF4CAF50
		        ),
		        new com.neo.highlight.util.scheme.ColorScheme(
		                Pattern.compile("\b\\.svg"),0xFFFF9800
		        )
		
		);
		highlight.setSpan(_textview1);
	}
	
	
	public void _themeinstall(final ArrayList<HashMap<String, Object>> _list, final double _pos, final String _str) {
		if (_list.get((int)_pos).get(_str).toString().endsWith(".AA")) {
			if (FileUtil.isFile("/storage/emulated/0/GhostWebIDE/theme/GhostThemeapp.ghost")) {
				var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
				    di.setTitle("هشدار");
				di.setMessage("این فایل تم در حافظه شما موجود است آیا میخواهید این تم را جایگزین کنید؟");
				di.setNeutralButton("بله", (p, d) -> {
					
					         try {
						
											new net.lingala.zip4j.ZipFile(_list.get((int)_pos).get(_str).toString())
													.extractAll("/storage/emulated/0/GhostWebIDE/");
						
									} catch (net.lingala.zip4j.exception.ZipException e) {
											showMessage(e.toString());
									}
					_getFiles("");
					SketchwareUtil.showMessage(getApplicationContext(), "انجام شد");
					
								});
				di.setPositiveButton("خیر", (p1, d2) -> {
					
					          
					
								});
				di.show();
				
				
				
				
			}
			else {
				try {
					
										new net.lingala.zip4j.ZipFile(_list.get((int)_pos).get(_str).toString())
												.extractAll("/storage/emulated/0/GhostWebIDE/");
					
								} catch (net.lingala.zip4j.exception.ZipException e) {
										showMessage(e.toString());
								}
				_getFiles("");
				SketchwareUtil.showMessage(getApplicationContext(), "انجام شد");
			}
		}
	}
	
	
	public void _serachfilebeta() {
		
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
		    ViewGroup viewGroup = findViewById(android.R.id.content);
				View dialogview = getLayoutInflater().inflate(R.layout.reminderlist, viewGroup, false);
		com.google.android.material.textfield.TextInputLayout input = dialogview.findViewById(R.id.input);
		EditText ed = dialogview.findViewById(R.id.ed);
		ProgressBar bar = dialogview.findViewById(R.id.bar);
		ListView mlist = dialogview.findViewById(R.id.mlist);
		TextView error = dialogview.findViewById(R.id.error);
		TextView result = dialogview.findViewById(R.id.result);
		bar.setVisibility(View.GONE);
		error.setVisibility(View.GONE);
		error.setTextColor(0xFFFDA893);
		result.setVisibility(View.GONE);
		di.setTitle("Search File");
		input.setEndIconCheckable(true);
		input.setEndIconVisible(true);
		input.setEndIconDrawable(R.drawable.msearchfileandfolder);
		input.setEndIconOnClickListener(v ->{
						
						input.setEnabled(false);
			bar.setVisibility(View.VISIBLE);
			result.setVisibility(View.VISIBLE);
			result.setText("Searching .....");
			
			_searcher(bar, mlist, result, error, ed);
			input.setEnabled(true);
			
				});
		di.setPositiveButton("بستن", (p1, d2) -> {
			
			          
			
						});
		di.setView(dialogview);
		di.show();
		
		
		
		
	}
	
	
	public void _sead() {
	}
	public class MyListViewHsiListAdapter extends BaseAdapter {
				
				ArrayList<HashMap<String, Object>> _data;
				
				public MyListViewHsiListAdapter(ArrayList<HashMap<String, Object>> _arr) {
						_data = _arr;
				}
				
				@Override
				public int getCount() {
						return _data.size();
				}
				
				@Override
				public HashMap<String, Object> getItem(int _index) {
						return _data.get(_index);
				}
				
				@Override
				public long getItemId(int _index) {
						return _index;
				}
				
				@Override
				public View getView(final int _position, View _v, ViewGroup _container) {
						LayoutInflater _inflater = getLayoutInflater();
						View _view = _v;
						if (_view == null) {
								_view = _inflater.inflate(R.layout.aaa, null);
						}
						
			
						
			       
			      final LinearLayout main = _view.findViewById(R.id.main);
			final TextView tv = _view.findViewById(R.id.tv);
			final TextView tvnull = _view.findViewById(R.id.tvnull);
			final ImageView img = _view.findViewById(R.id.img);
			tv.setText(Uri.parse(_data.get((int)_position).get("mfiles").toString()).getLastPathSegment());
			_clickAnimation(main);
			final String sodocerListMapRemainder = _data.get((int)_position).get("mfiles").toString();
			if (FileUtil.isDirectory(sodocerListMapRemainder)) {
				img.setImageResource(R.drawable.folder);
			}
			else {
				if (sodocerListMapRemainder.endsWith(".html")) {
					SvgShow.GetAsster(getApplicationContext() , img , "file_type_html.svg");
				}
				else {
					if (sodocerListMapRemainder.endsWith(".css")) {
						SvgShow.GetAsster(getApplicationContext() , img , "file_type_css.svg");
					}
					else {
						if (sodocerListMapRemainder.endsWith(".js")) {
							SvgShow.GetAsster(getApplicationContext() , img , "file_type_node.svg");
						}
						else {
							if (sodocerListMapRemainder.endsWith(".svg")) {
								try{
									SvgShow.GetFileSvg(sodocerListMapRemainder,img,getApplicationContext());
									
									
									
								}catch(Exception e){
										SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_svg.svg");
								}
								
								
							}
							else {
								if (_data.get((int)_position).get("mfiles").toString().endsWith(".png")) {
									Glide.with(getApplicationContext())
									.load(_data.get((int)_position).get("mfiles").toString())
									.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
									.circleCrop()
									.error(R.drawable.keyboardlisnertalluserpost_3)
									.thumbnail((float)0.1d)
									.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
									.priority(Priority.HIGH)
									.into(img);
								}
								else {
									if (sodocerListMapRemainder.endsWith(".py")) {
										SvgShow.GetAsster(getApplicationContext() , img , "file_type_python.svg");
									}
									else {
										if (sodocerListMapRemainder.endsWith(".jar")) {
											SvgShow.GetAsster(getApplicationContext() , img , "file_type_jar.svg");
										}
										else {
											if (sodocerListMapRemainder.endsWith(".scss")) {
												SvgShow.GetAsster(getApplicationContext() , img , "file_type_scss2.svg");
											}
											else {
												if (sodocerListMapRemainder.endsWith(".json")) {
													SvgShow.GetAsster(getApplicationContext() , img , "file_type_json2.svg");
												}
												else {
													if (sodocerListMapRemainder.endsWith(".java")) {
														SvgShow.GetAsster(getApplicationContext() , img , "file_type_java.svg");
													}
													else {
														if (sodocerListMapRemainder.endsWith(".cpp")) {
															SvgShow.GetAsster(getApplicationContext() , img , "file_type_cpp3.svg");
														}
														else {
															if (sodocerListMapRemainder.endsWith(".c")) {
																SvgShow.GetAsster(getApplicationContext() , img , "file_type_c3.svg");
															}
															else {
																if (sodocerListMapRemainder.endsWith(".cs")) {
																	SvgShow.GetAsster(getApplicationContext() , img , "file_type_csharp2.svg");
																}
																else {
																	if (sodocerListMapRemainder.endsWith(".xml")) {
																		SvgShow.GetAsster(getApplicationContext() , img , "file_type_source.svg");
																	}
																	else {
																		if (sodocerListMapRemainder.endsWith(".ghost")) {
																			SvgShow.GetAsster(getApplicationContext() , img , "file_type_ink.svg");
																		}
																		else {
																			if (sodocerListMapRemainder.endsWith(".ninja")) {
																				SvgShow.GetAsster(getApplicationContext() , img , "file_type_ninja.svg");
																			}
																			else {
																				if (sodocerListMapRemainder.endsWith(".sh")) {
																					SvgShow.GetAsster(getApplicationContext() , img , "rowbash.svg");
																				}
																				else {
																					if (sodocerListMapRemainder.endsWith(".md")) {
																						SvgShow.GetAsster(getApplicationContext() , img , "mdx.svg");
																					}
																					else {
																						if (sodocerListMapRemainder.endsWith(".web")) {
																							img.setImageResource(R.drawable.webproject);
																						}
																						else {
																							if (sodocerListMapRemainder.endsWith(".php")) {
																								img.setImageResource(R.drawable.languagephp);
																							}
																							else {
																								if (sodocerListMapRemainder.endsWith(".apk")) {
																									try { 
																											
																											
																												
																											android.content.pm.PackageManager packageManager = FiledirActivity.this.getPackageManager();
																											android.content.pm.PackageInfo packageInfo = packageManager.getPackageArchiveInfo(sodocerListMapRemainder, 0);
																											packageInfo.applicationInfo.sourceDir = sodocerListMapRemainder;
																											packageInfo.applicationInfo.publicSourceDir = sodocerListMapRemainder;
																											img.setImageDrawable(packageInfo.applicationInfo.loadIcon(packageManager));
																											packageInfo = null;
																											packageManager = null;
																											
																									} catch (Exception e){
																											e.printStackTrace();
																									}
																								}
																								else {
																									if (sodocerListMapRemainder.endsWith(".go")) {
																										img.setImageResource(R.drawable.languagego);
																									}
																									else {
																										if (sodocerListMapRemainder.endsWith(".txt")) {
																											img.setImageResource(R.drawable.txtfile);
																										}
																										else {
																											if (sodocerListMapRemainder.endsWith(".pdf")) {
																												img.setImageResource(R.drawable.pdfview);
																											}
																											else {
																												if (sodocerListMapRemainder.endsWith(".zip") || sodocerListMapRemainder.endsWith(".tar")) {
																													img.setImageResource(R.drawable.zipandtar);
																												}
																												else {
																													if (sodocerListMapRemainder.endsWith(".rar")) {
																														img.setImageResource(R.drawable.rartarget);
																													}
																													else {
																														if (sodocerListMapRemainder.endsWith(".kt")) {
																															SvgShow.GetAsster(getApplicationContext() , img , "kotlin.svg");
																														}
																														else {
																															if (sodocerListMapRemainder.endsWith(".rb") || sodocerListMapRemainder.endsWith(".rbw")) {
																																SvgShow.GetAsster(getApplicationContext() , img , "ruby.svg");
																															}
																															else {
																																if (sodocerListMapRemainder.endsWith(".dart")) {
																																	SvgShow.GetAsster(getApplicationContext() , img , "dart.svg");
																																}
																																else {
																																	if (sodocerListMapRemainder.endsWith(".swift")) {
																																		SvgShow.GetAsster(getApplicationContext() , img , "swift.svg");
																																	}
																																	else {
																																		if (sodocerListMapRemainder.endsWith(".ttf") || sodocerListMapRemainder.endsWith(".otf")) {
																																			img.setImageResource(R.drawable.fontlookimageview);
																																		}
																																		else {
																																			if (sodocerListMapRemainder.endsWith(".AA")) {
																																				img.setImageResource(R.drawable.resulttheme);
																																			}
																																			else {
																																				if (sodocerListMapRemainder.endsWith(".svg")) {
																																					_gogo(_data.get((int)_position).get("mfiles").toString(), img, tvnull);
																																				}
																																				else {
																																					if (sodocerListMapRemainder.endsWith(".jpg")) {
																																						Glide.with(getApplicationContext())
																																						.load(_data.get((int)_position).get("mfiles").toString())
																																						.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																																						.circleCrop()
																																						.error(R.drawable.keyboardlisnertalluserpost_3)
																																						.thumbnail((float)0.1d)
																																						.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																																						.priority(Priority.HIGH)
																																						.into(img);
																																					}
																																					else {
																																						if (sodocerListMapRemainder.endsWith(".mp3")) {
																																							Glide.with(getApplicationContext())
																																							.load(_data.get((int)_position).get("mfiles").toString())
																																							.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																																							.circleCrop()
																																							.error(R.drawable.keyboardlisnertalluserpost_3)
																																							.thumbnail((float)0.1d)
																																							.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																																							.priority(Priority.HIGH)
																																							.into(img);
																																						}
																																						else {
																																							if (sodocerListMapRemainder.endsWith(".mp4")) {
																																								Glide.with(getApplicationContext())
																																								.load(_data.get((int)_position).get("mfiles").toString())
																																								.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																																								.circleCrop()
																																								.error(R.drawable.keyboardlisnertalluserpost_3)
																																								.thumbnail((float)0.1d)
																																								.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																																								.priority(Priority.HIGH)
																																								.into(img);
																																							}
																																							else {
																																								SvgShow.GetAsster(getApplicationContext() , img , "default_file.svg");
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
						
						return _view;
				}
		}
	
	{
	}
	
	
	public void _importpojectm() {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.projectimport)
		.setTitle("پشتیبان گیری از پروژه ")
		.setMessage("لطفا مسیر را وارد کنید بدون فایل فقط نام پوشه")
		.setCancelable(true)
		.setPositiveButton("قبول", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			EditText edb = dialog.findViewById(R.id.edb);		
			
			com.google.android.material.textfield.TextInputLayout input = dialog.findViewById(R.id.input);		
			
			if (edb.getText().toString().isEmpty()) {
				positive.setEnabled(false);
			}
			else {
				positive.setEnabled(true);
			}
			edb.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (edb.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
			positive.setOnClickListener((vftrororocjj) -> {
				
				             new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						prodel.setTitle("در حال ایجاد پروژه");
						prodel.setCancelable(false);
						prodel.setCanceledOnTouchOutside(false);
						prodel.show();
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (!FileUtil.isFile(edb.getText().toString())) {
									try {
										
															new net.lingala.zip4j.ZipFile(Folder.concat("/myproject".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(0), (int)(5682738)))).concat(".project")))).addFolder(new java.io.File(edb.getText().toString()));
										
													} catch (net.lingala.zip4j.exception.ZipException e) {
															showMessage(e.toString());
													}
								}
								else {
									if (FileUtil.isDirectory(edb.getText().toString())) {
										try {
											
																				new net.lingala.zip4j.ZipFile(new java.io.File(Folder.concat("/myproject".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(0), (int)(5682738)))).concat(".project"))))).addFile(new java.io.File(edb.getText().toString()));							
											
														} catch (net.lingala.zip4j.exception.ZipException e) {
																showMessage(e.toString());
														}
									}
								}
							}
						});
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						prodel.dismiss();
						_getFiles("");
					}
				}.execute("");
				dialog.dismiss();
								
						});
		});
		dialog.show();
	}
	
	
	public void _installproject(final ArrayList<HashMap<String, Object>> _maps, final String _pathz, final double _number) {
		if (_maps.get((int)_number).get(_pathz).toString().endsWith(".project")) {
			var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
			    di.setTitle("نصب پروژه ؟");
			di.setMessage("آیا میخواهید ".concat(Uri.parse(_maps.get((int)_number).get(_pathz).toString()).getLastPathSegment().concat(" نصب کنید؟")));
			di.setPositiveButton("نصب", (p1, d2) -> {
				
				         new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						prodel.setTitle("در حال نصب صبر کنید....");
						prodel.setCancelable(false);
						prodel.setCanceledOnTouchOutside(false);
						prodel.show();
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								try {
									
														new net.lingala.zip4j.ZipFile(_maps.get((int)_number).get(_pathz).toString())
																.extractAll(Folder);
									
												} catch (net.lingala.zip4j.exception.ZipException e) {
														showMessage(e.toString());
												}
								_getFiles("");
							}
						});
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						prodel.dismiss();
					}
				}.execute("");
				
							});
			di.setNegativeButton("مشاهده", (p3, d3) -> {
				
				         void10.setClass(getApplicationContext(), ZipshowActivity.class);
				void10.putExtra("zipview", _maps.get((int)_number).get(_pathz).toString());
				startActivity(void10);
				
							});
			di.setNeutralButton("بستن", (p, d) -> {
				
				          
				
							});
			di.show();
			
			
			
			
		}
	}
	
	
	public void _searcher(final ProgressBar _bb, final ListView _list, final TextView _done, final TextView _errors, final TextView _edi) {
		_bb.setVisibility(View.VISIBLE);
		arm = _edi.getText().toString();
		map.clear();
		str1.clear();
		str2.clear();
		
		
		
		
		new Thread(new Runnable() {
			              @Override
			              public void run() {
				 Looper.prepare();
												directoryName = Folder;
												listf(directoryName, str1);
												for(int _repeat12 = 0; _repeat12 < (int)(str1.size()); _repeat12++) {
															{
																		HashMap<String, Object> _item = new HashMap<>();
																		_item.put("mfiles", str1.get((int)(_repeat12)));
																		map.add(_item);
															}
					
															
												}
				
				                runOnUiThread(new Runnable() {
					                  @Override
					                  public void run() {
						
																if (!(map.size() == 0))	
																	try{
							_list.setAdapter(new MyListViewHsiListAdapter(map));
						}catch(Exception e){
							_errors.setText("0");
						}
						_done.setVisibility(View.VISIBLE);
						try{
							_done.setText("Result Item (".concat(String.valueOf((long)(map.size())).concat(")")));
						}catch(Exception e){
							_errors.setText(e.toString());
						}
						if (map.size() == 0) {
							_list.setVisibility(View.GONE);
							_errors.setText("Not Found Data");
						}
						else {
							_list.setVisibility(View.VISIBLE);
						}
						_bb.setVisibility(View.GONE);						
														//alerto33.dismiss();
														
						Looper.loop();
														  }
					                });
				              }
			            }).start();
		
		
		 
		
		
		
	}
	public void listf(final String directoryName, final ArrayList<String> str1) {	              
				
				        java.io.File directory = new java.io.File(directoryName);
				         
				         java.io.File[] fList = directory.listFiles();
				        
				         if(fList != null)
				             for (java.io.File file : fList) {
						                   if (file.isFile() && file.getPath().substring(file.getPath().lastIndexOf("/")+1).toLowerCase().contains(arm)) {
								         str2.add(file.getAbsolutePath());                
								         str1.add(file.getPath().substring(file.getPath().lastIndexOf("/")+1));
								         
								                            } else if (file.isDirectory()) {
								                         listf(file.getPath(), str1);
								                     }
						               }						                																	         
		          
		     }
	private String directoryName = "";
	private java.io.File directory;
	private java.io.File[] fList;
	private java.io.File file;
	{
	}
	
	
	public void _insertData(final double _pos) {
		if (files.get((int)_pos).get("path").toString().endsWith(".tif") || (files.get((int)_pos).get("path").toString().endsWith(".tiff") || (files.get((int)_pos).get("path").toString().endsWith(".png") || (files.get((int)_pos).get("path").toString().endsWith(".jpg") || (files.get((int)_pos).get("path").toString().endsWith(".jpeg") || (files.get((int)_pos).get("path").toString().endsWith(".webp") || (files.get((int)_pos).get("path").toString().endsWith(".bmp") || files.get((int)_pos).get("path").toString().endsWith(".gif")))))))) {
			void10.setClass(getApplicationContext(), ImgshowActivity.class);
			void10.putExtra("imagePath", Folder);
			void10.putExtra("imageName", Uri.parse(files.get((int)_pos).get("path").toString()).getLastPathSegment());
			startActivity(void10);
		}
	}
	
	
	public void _D8convert() {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.d8tools)
		.setTitle("D8 Tools")
		.setMessage("")
		.setCancelable(true)
		.setPositiveButton("ok", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       EditText outputjar = dialog.findViewById(R.id.outputjar);		
			
			EditText inputjar = dialog.findViewById(R.id.inputjar);		
			
			ProgressBar pro = dialog.findViewById(R.id.pro);		
			
			com.google.android.material.textfield.TextInputLayout tvin = dialog.findViewById(R.id.tvin);		
			
			com.google.android.material.textfield.TextInputLayout tvou = dialog.findViewById(R.id.tvou);		
			
			Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			inputjar.setText(staticstring.trim());
			outputjar.setText(GetTab.trim());
			pro.setVisibility(View.GONE);
			if (inputjar.getText().toString().isEmpty()) {
				positive.setEnabled(false);
			}
			else {
				positive.setEnabled(true);
			}
			if (outputjar.getText().toString().isEmpty()) {
				positive.setEnabled(false);
			}
			else {
				positive.setEnabled(true);
			}
			outputjar.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (inputjar.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					if (outputjar.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
			inputjar.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (inputjar.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					if (outputjar.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
			positive.setOnClickListener((vftrororocjj) -> {
				
				             new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
						pro.setVisibility(View.VISIBLE);
						inputjar.setEnabled(false);
						outputjar.setEnabled(false);
						positive.setEnabled(false);
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						args.clear();
						
						args.add("--release");
						args.add("--lib");
						args.add("/storage/emulated/0/GhostWebIDE/android/android.jar");
						
						args.add("--output");
						args.add(outputjar.getText().toString());
						args.add(inputjar.getText().toString());
						try {
								
								D8.main(args.toArray(new String[0]));
								
						} catch(final Exception e) {
								
							runOnUiThread(() -> {
								SketchwareUtil.showMessage(getApplicationContext(), e.toString());
							});
						}
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						pro.setVisibility(View.GONE);
						inputjar.setEnabled(false);
						outputjar.setEnabled(false);
						positive.setEnabled(false);
						getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
						SketchwareUtil.showMessage(getApplicationContext(), "Convert to ".concat(GetTab.concat("classes.dex")));
						_getFiles("");
						dialog.dismiss();
					}
				}.execute("");
								
						});
		});
		dialog.show();
	}
	
	
	public void _dicomplier() {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.classjardicompiler)
		.setTitle("Dicompiler ")
		.setMessage("")
		.setCancelable(true)
		.setPositiveButton("run", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       EditText input = dialog.findViewById(R.id.input);		
			
			EditText output = dialog.findViewById(R.id.output);		
			
			com.google.android.material.textfield.TextInputLayout tvin = dialog.findViewById(R.id.tvin);		
			
			com.google.android.material.textfield.TextInputLayout tvou = dialog.findViewById(R.id.tvou);		
			
			ProgressBar pros = dialog.findViewById(R.id.pros);		
			
			input.setText(staticstring);
			pros.setVisibility(View.GONE);
			output.setText(GetTab);
			Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			positive.setOnClickListener((vftrororocjj) -> {
				
				             if (output.getText().toString().isEmpty()) {
					SketchwareUtil.showMessage(getApplicationContext(), "خروجی نمیتواند خالی باشد");
				}
				else {
					new AsyncTask<String, String, String>() {
						@Override
						protected void onPreExecute() {
							input.setEnabled(false);
							output.setEnabled(false);
							pros.setEnabled(true);
							pros.setVisibility(View.VISIBLE);
							tvin.setEnabled(false);
							tvou.setEnabled(false);
							tvou.setEnabled(false);
							positive.setEnabled(false);
						}
						@Override
						protected String doInBackground(String... params) {
							String _param = params[0];
							pv.clear();
							pv.add(input.getText().toString());
							pv.add("--extraclasspath");
							pv.add("/storage/emulated/0/GhostWebIDE/android/android.jar");
							pv.add("--outputdir");
							pv.add(output.getText().toString());
							//String[] CFRDicompier = {
								//	"-jar",
								//input.getText().toString(),
								
							//	"--extraclasspath",
								
							//	androidjar.getText().toString(),
								
								//"--outputdir",
							//	output.getText().toString()
							//};
							
							
							try{
									org.benf.cfr.reader.Main.main(pv.toArray(new String[0]));
							}catch(Exception e){
									
								
								
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										SketchwareUtil.showMessage(getApplicationContext(), e.toString());
									}
								});
							}
							return "";
						}
						@Override
						protected void onPostExecute(String _result) {
							tvin.setEnabled(true);
							tvou.setEnabled(true);
							input.setEnabled(true);
							output.setEnabled(true);
							pros.setEnabled(true);
							pros.setVisibility(View.GONE);
							positive.setEnabled(true);
							_getFiles("");
							dialog.dismiss();
						}
					}.execute("");
				}
								
						});
		});
		dialog.show();
	}
	
	
	public void _rename(final double _pos) {
		androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		
		    .setView(R.layout.ranme)
		.setTitle("Rename")
		.setMessage("type new name ")
		.setCancelable(false)
		.setPositiveButton("Ok", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		dialog.setOnShowListener((var) -> {
			
			       EditText editor = dialog.findViewById(R.id.editor);		
			
			Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
			editor.setText(Uri.parse(files.get((int)_pos).get("path").toString()).getLastPathSegment());
			if (editor.getText().toString().isEmpty()) {
				positive.setEnabled(false);
			}
			else {
				positive.setEnabled(true);
			}
			editor.addTextChangedListener(new android.text.TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String _charSeq = _param1.toString();
								         
					              if (editor.getText().toString().isEmpty()) {
						positive.setEnabled(false);
					}
					else {
						positive.setEnabled(true);
					}
					   
								}
				
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								}
				
								@Override
								public void afterTextChanged(android.text.Editable _param1) {
								}
						});
			positive.setOnClickListener((vftrororocjj) -> {
				
				             files.get((int)_pos).get("path").toString().renameTo(new File(Folder.concat("/".concat(editor.getText().toString()))));
				dialog.dismiss();
				_getFiles("");
								
						});
		});
		dialog.show();
	}
	
	
	public void _delFileCustom(final double _pos) {
		var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
		    di.setTitle("Romved File");
		di.setMessage("romved ".concat(files.get((int)_pos).get("path").toString().concat(" your mobile?")));
		di.setNeutralButton("no", (p, d) -> {
			
			          
			
						});
		di.setPositiveButton("ok", (p1, d2) -> {
			
			         new AsyncTask<String, String, String>() {
				@Override
				protected void onPreExecute() {
					prodel.setTitle("Romving ...");
					prodel.setMessage("removing ".concat(files.get((int)_pos).get("path").toString().concat(" now")));
					prodel.setCancelable(false);
					prodel.setCanceledOnTouchOutside(false);
					prodel.show();
				}
				@Override
				protected String doInBackground(String... params) {
					String _param = params[0];
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							FileUtil.deleteFile(files.get((int)_pos).get("path").toString());
						}
					});
					return "";
				}
				@Override
				protected void onPostExecute(String _result) {
					prodel.dismiss();
					_getFiles("");
				}
			}.execute("");
			
						});
		di.show();
		
		
		
		
	}
	
	
	public void _dataOnClickItemList(final double _pos) {
		newpos = _pos;
		if (staticstring.endsWith(".txt")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".go")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".css")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".php")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".js")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".html")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".dart")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".kt")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".swift")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".rb")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".rbw")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".c")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".scss")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".cs")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".java")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".json")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".cpp")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".py")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".ghost")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".xml")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".ninja")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".md")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".sh")) {
			_checkListMap2(newpos, "path", files, newlistmap);
		}
		if (staticstring.endsWith(".svg")) {
			androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
			
			    .setTitle("Svg ")
			.setMessage("توجه داشته باشید با زدن روی Options میتوانید عمل کرد های زیرا تست کنید")
			.setPositiveButton("Options", null)
			.setNegativeButton(android.R.string.cancel, null)
			.create();
			dialog.setOnShowListener((var) -> {
				
				       Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
				positive.setOnClickListener((vftrororocjj) -> {
					
					             mmenuVector = new PowerMenu.Builder(FiledirActivity.this)
					.addItem(new PowerMenuItem("View"))
					.addItem(new PowerMenuItem("Edit"))
					.addItem(new PowerMenuItem("Convert to Vector"))
					.build();//   my telegram channel sketchware95
					mmenuVector.showAsDropDown(positive);
					mmenuVector.setAutoDismiss(true);
					mmenuVector.setShowBackground(false);
					mmenuVector.setMenuColor(0xFF2B2121);
					mmenuVector.setSelectedMenuColor(0xFFFDA893);
					mmenuVector.setSelectedEffect(true);//   my telegram channel sketchware95
					mmenuVector.setDividerHeight((int)2);
					mmenuVector.setTextColor(0xFFEEEEEE);//   my telegram channel sketchware95
					mmenuVector.setTextSize((int)14);
					mmenuVector.setTextTypeface(Typeface.create(Typeface.createFromAsset(getAssets(),"fonts/ghostfont.ttf"), Typeface.NORMAL));//my telegram channel sketchware95
					mmenuVector.setDivider(new ColorDrawable(0xFFF59271));
					mmenuVector.setCircularEffect(CircularEffect.INNER);//   my telegram channel sketchware95
					mmenuVector.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>(){
						   @Override
						     public void onItemClick(int position, PowerMenuItem item){
							          switch((int)position) {
								case ((int)0): {
									dialog.dismiss();
									void10.setClass(getApplicationContext(), ImgshowActivity.class);
									void10.putExtra("imagePath", Folder);
									void10.putExtra("imageName", Uri.parse(files.get((int)_pos).get("path").toString()).getLastPathSegment());
									startActivity(void10);
									break;
								}
								case ((int)1): {
									dialog.dismiss();
									_checkListMap2(newpos, "path", files, newlistmap);
									break;
								}
								case ((int)2): {
									vb.iconPath = staticstring;
									vb.projectResourceDirectory = GetTab;
									vb.v(FiledirActivity.this);
									
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
		if (staticstring.endsWith(".jar")) {
			var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
			    di.setTitle("لطفا یکی از گزینه های زیر را انتخاب کنید");
			di.setMessage("توجه داشته باشید که برای تغییر jar به dex گزینه مناسب را انتخاب کنید ممکن است تغییرات و یا دیکامپایل کردن چند دقیقه طول بکشد یا حتی این عمل انجام نشود");
			di.setCancelable(false);
			di.setPositiveButton("D8 Convert", (p1, d2) -> {
				
				         _D8convert();
				
							});
			di.setNeutralButton("Dicompile", (p, d) -> {
				
				         _dicomplier();
				
							});
			di.setNegativeButton("viewfile", (p3, d3) -> {
				
				         void10.setClass(getApplicationContext(), ZipshowActivity.class);
				void10.putExtra("zipview", staticstring);
				startActivity(void10);
				
							});
			di.show();
			
			
			
			
		}
		if (staticstring.endsWith(".mp3")) {
			try {
				    m = new MediaPlayer();
				        m.setDataSource(staticstring);
				        m.prepare();
				    } catch (java.io.IOException e) {
				        e.printStackTrace();
				    }
			final MaterialAlertDialogBuilder alert = new MaterialAlertDialogBuilder(FiledirActivity.this);
			ViewGroup viewGroup = findViewById(android.R.id.content);
			View dialogview = getLayoutInflater().inflate(R.layout.music, viewGroup, false);
			Button btn = dialogview.findViewById(R.id.btn);
			Button btn2 =dialogview.findViewById(R.id.btn2);
			Button btn3= dialogview.findViewById(R.id.btn3);
			SeekBar seek = dialogview.findViewById(R.id.seek);
			ImageView image =dialogview.findViewById(R.id.image);
			alert.setCancelable(false);
			{
					final android.media.MediaMetadataRetriever mmr = new android.media.MediaMetadataRetriever();
					mmr.setDataSource(staticstring);
					
					byte [] data = mmr.getEmbeddedPicture();
					
					if(data != null)
					{
							final Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
							image.setImageBitmap(bitmap);
					}
					else
					{
					        image.setImageResource(R.drawable.musico);
							
					}
					
					image.setAdjustViewBounds(true);
			}
			
			seek.setMax((int) m.getDuration() / 90);
			
			final Handler mHandler = new Handler();
			runOnUiThread(new Runnable() {
					
					@Override
					public void run() {
							if (m != null) {
									int mCurrentPosition = m.getCurrentPosition() / 90;
									seek.setProgress(mCurrentPosition);
							}
							mHandler.postDelayed(this, 90);
					}
			});
			seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
					
					@Override
					public void onStopTrackingTouch(SeekBar seekBar) {
							
					}
					
					@Override
					public void onStartTrackingTouch(SeekBar seekBar) {
							
					}
					
					@Override
					public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
							if (m != null && fromUser) {
									m.seekTo(progress * 90);
									
							}
					}
			});
			
			
			btn3.setOnTouchListener(new View.OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
							switch (event.getAction()) {
									case MotionEvent.ACTION_DOWN: {
											ObjectAnimator scaleX = new ObjectAnimator();
											scaleX.setTarget(btn3);
											scaleX.setPropertyName("scaleX");
											scaleX.setFloatValues(0.9f);
											scaleX.setDuration((int) 5);
											scaleX.start();
											
											ObjectAnimator scaleY = new ObjectAnimator();
											scaleY.setTarget(btn3);
											scaleY.setPropertyName("scaleY");
											scaleY.setFloatValues(0.9f);
											scaleY.setDuration((int) 5);
											scaleY.start();
											break;
									}
									case MotionEvent.ACTION_UP: {
											
											ObjectAnimator scaleX = new ObjectAnimator();
											scaleX.setTarget(btn3);
											scaleX.setPropertyName("scaleX");
											scaleX.setFloatValues((float) 1);
											scaleX.setDuration((int) 5);
											scaleX.start();
											
											ObjectAnimator scaleY = new ObjectAnimator();
											scaleY.setTarget(btn3);
											scaleY.setPropertyName("scaleY");
											scaleY.setFloatValues((float) 1);
											scaleY.setDuration((int) 5);
											scaleY.start();
											
											break;
									}
							}
							return false;
							
					}
			});
			btn.setOnTouchListener(new View.OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
							switch (event.getAction()) {
									case MotionEvent.ACTION_DOWN: {
											ObjectAnimator scaleX = new ObjectAnimator();
											scaleX.setTarget(btn);
											scaleX.setPropertyName("scaleX");
											scaleX.setFloatValues(0.9f);
											scaleX.setDuration((int) 5);
											scaleX.start();
											
											ObjectAnimator scaleY = new ObjectAnimator();
											scaleY.setTarget(btn);
											scaleY.setPropertyName("scaleY");
											scaleY.setFloatValues(0.9f);
											scaleY.setDuration((int) 5);
											scaleY.start();
											break;
									}
									case MotionEvent.ACTION_UP: {
											
											ObjectAnimator scaleX = new ObjectAnimator();
											scaleX.setTarget(btn);
											scaleX.setPropertyName("scaleX");
											scaleX.setFloatValues((float) 1);
											scaleX.setDuration((int) 5);
											scaleX.start();
											
											ObjectAnimator scaleY = new ObjectAnimator();
											scaleY.setTarget(btn);
											scaleY.setPropertyName("scaleY");
											scaleY.setFloatValues((float) 1);
											scaleY.setDuration((int) 5);
											scaleY.start();
											
											break;
									}
							}
							return false;
					}
			});
			btn2.setOnTouchListener(new View.OnTouchListener() {
					@Override
					public boolean onTouch(View v, MotionEvent event) {
							switch (event.getAction()) {
									case MotionEvent.ACTION_DOWN: {
											ObjectAnimator scaleX = new ObjectAnimator();
											scaleX.setTarget(btn2);
											scaleX.setPropertyName("scaleX");
											scaleX.setFloatValues(0.9f);
											scaleX.setDuration((int) 5);
											scaleX.start();
											
											ObjectAnimator scaleY = new ObjectAnimator();
											scaleY.setTarget(btn2);
											scaleY.setPropertyName("scaleY");
											scaleY.setFloatValues(0.9f);
											scaleY.setDuration((int) 5);
											scaleY.start();
											break;
									}
									case MotionEvent.ACTION_UP: {
											
											ObjectAnimator scaleX = new ObjectAnimator();
											scaleX.setTarget(btn2);
											scaleX.setPropertyName("scaleX");
											scaleX.setFloatValues((float) 1);
											scaleX.setDuration((int) 5);
											scaleX.start();
											
											ObjectAnimator scaleY = new ObjectAnimator();
											scaleY.setTarget(btn2);
											scaleY.setPropertyName("scaleY");
											scaleY.setFloatValues((float) 1);
											scaleY.setDuration((int) 5);
											scaleY.start();
											
											break;
									}
							}
							return false;
					}
			});
			if (m.isPlaying()) {
					btn3.setText("ایست");
			} else {
					btn3.setText("شروع");
			}
			btn.setOnClickListener((vv)-> {
					
			});
			
			btn2.setOnClickListener((b)-> {
					
			});
			btn3.setOnClickListener((v) -> {
					
					if (m.isPlaying()) {
							btn3.setText("شروع");
							m.pause();
					} else {
							btn3.setText("ایست");
							m.start();
					}
					
			});
			final String _btn9 = ("خروج");
			alert.setPositiveButton(_btn9, (i,v)-> {
					
					m.reset();
					
					
			});
			seek.setProgressTintList(ColorStateList.valueOf(0xFFFF9800));
			
			seek.getThumb().setColorFilter((0xFFFF9800), PorterDuff.Mode.MULTIPLY);
			
			alert.setView(dialogview);
			alert.create().show();
			
		}
		if (staticstring.endsWith(".mp4")) {
			govirwFilm.setClass(getApplicationContext(), VideoviewsActivity.class);
			govirwFilm.putExtra("getPath", staticstring);
			govirwFilm.putExtra("getTitle", Uri.parse(staticstring).getLastPathSegment());
			startActivity(govirwFilm);
		}
		if (staticstring.endsWith(".apk")) {
			var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
			    ViewGroup viewGroup = findViewById(android.R.id.content);
					View dialogview = getLayoutInflater().inflate(R.layout.apkfile, viewGroup, false);
			TextView tv = dialogview.findViewById(R.id.tv);
			ImageView ico = dialogview.findViewById(R.id.ico);
			tv.setText(Uri.parse(staticstring).getLastPathSegment());
			TextView name = dialogview.findViewById(R.id.name);
			TextView ver = dialogview.findViewById(R.id.ver);
			TextView code = dialogview.findViewById(R.id.code);
			TextView tar = dialogview.findViewById(R.id.tar);
			TextView min = dialogview.findViewById(R.id.min);
			try{
				GhostwebApk.setApkPath(staticstring);
				name.setText(GhostwebApk.getName());
				ver.setText(GhostwebApk.getVersionName());
				code.setText(GhostwebApk.getVersionCode());
				tar.setText(GhostwebApk.getTargetSdkVersion());
				min.setText(GhostwebApk.getMinSdkVersion());
				try { 
						
						
							
						android.content.pm.PackageManager packageManager = FiledirActivity.this.getPackageManager();
						android.content.pm.PackageInfo packageInfo = packageManager.getPackageArchiveInfo(staticstring, 0);
						packageInfo.applicationInfo.sourceDir = staticstring;
						packageInfo.applicationInfo.publicSourceDir = staticstring;
						ico.setImageDrawable(packageInfo.applicationInfo.loadIcon(packageManager));
						packageInfo = null;
						packageManager = null;
						
				} catch (Exception e){
						e.printStackTrace();
				}
			}catch(Exception e){
				 
			}
			di.setNeutralButton("install", (p, d) -> {
				
				         try {
					if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
											Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
													FiledirActivity.this.getPackageName() + ".provider", new java.io.File(staticstring));
											Intent intent = new Intent(Intent.ACTION_VIEW);
											intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
											intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
											intent.setDataAndType(uri, "application/vnd.android.package-archive");
											startActivity(intent);
						
									} else {
											Intent intent = new Intent(Intent.ACTION_VIEW);
											intent.setDataAndType(Uri.fromFile( new java.io.File(staticstring)),
													"application/vnd.android.package-archive");
											intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
											startActivity(intent);
									}
					
				} catch (Exception rr) {
					showMessage (rr.toString());
				}
				
							});
			di.setPositiveButton("no", (p1, d2) -> {
				
				          
				
							});
			di.setView(dialogview);
			di.show();
			
			
			
			
		}
		if (staticstring.endsWith(".pdf")) {
			getabout.setClass(getApplicationContext(), PdfviewActivity.class);
			getabout.putExtra("pdf", staticstring);
			getabout.putExtra("t", Uri.parse(staticstring).getLastPathSegment());
			startActivity(getabout);
		}
		_tarview(newpos, "path", files);
		_zipviewandexsert(newpos, "path", files);
		_fontpost(files, "path", newpos);
		_themeinstall(files, newpos, "path");
		_installproject(files, "path", newpos);
		_insertData(newpos);
	}
	
	
	public void _listviewViewBinding(final TextView _textview1, final ImageView _imageView1) {
		if (_textview1.getText().toString().contains("GhostWebIDE") || _textview1.getText().toString().equals("GhostWebIDE")) {
			_imageView1.setImageResource(R.drawable.foldercog);
			_textview1.setTextColor(0xFFCE93D8);
		}
		else {
			if (_textview1.getText().toString().contains("Android") || _textview1.getText().toString().equals("Android")) {
				_imageView1.setImageResource(R.drawable.folderandroid);
			}
			else {
				if (_textview1.getText().toString().contains("Download") || _textview1.getText().toString().equals("Download")) {
					_imageView1.setImageResource(R.drawable.folderdownload);
				}
				else {
					if (_textview1.getText().toString().contains("GhostWebIDE/theme") || _textview1.getText().toString().equals("GhostWebIDE/theme")) {
						_imageView1.setImageResource(R.drawable.color);
						_textview1.setTextColor(0xFFFFA000);
					}
					else {
						if (_textview1.getText().toString().contains(".sketchware") || _textview1.getText().toString().equals(".sketchware")) {
							_textview1.setTextColor(0xFF90CAF9);
							_imageView1.setImageResource(R.drawable.foldersketchware);
						}
						else {
							_textview1.setTextColor(0xFFE0E0E0);
							_imageView1.setImageResource(R.drawable.folder);
						}
					}
				}
			}
		}
	}
	
	
	public void _onClickItem(final double _pos) {
		new AsyncTask<String, String, String>() {
			@Override
			protected void onPreExecute() {
				postTask.setVisibility(View.VISIBLE);
				recyclerview2.setVisibility(View.GONE);
			}
			@Override
			protected String doInBackground(String... params) {
				String _param = params[0];
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						post = _pos;
						if (Chack) {
							files.get((int)_pos).put("sel", "true");
							recyclerview2.setAdapter(new Recyclerview2Adapter(files));
							recyclerview2.getAdapter().notifyDataSetChanged();
						}
						else {
							files.get((int)_pos).put("sel", "false");
							recyclerview2.setAdapter(new Recyclerview2Adapter(files));
							recyclerview2.getAdapter().notifyDataSetChanged();
							staticstring = files.get((int)_pos).get("path").toString();
							if (FileUtil.isDirectory(staticstring)) {
								Folder = staticstring;
								overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
								cache.add(Double.valueOf(post));
								_getFiles("");
							}
							else {
								_dataOnClickItemList(post);
							}
						}
					}
				});
				return "";
			}
			@Override
			protected void onPostExecute(String _result) {
				postTask.setVisibility(View.GONE);
				recyclerview2.setVisibility(View.VISIBLE);
			}
		}.execute("");
	}
	
	
	public void _onLongClickItem(final double _postInitUser) {
		if (Chack) {
			Chack = false;
			linearDis.setVisibility(View.GONE);
			linear9.setVisibility(View.VISIBLE);
			_cleardata();
			_getFiles("");
		}
		else {
			Chack = true;
			files.get((int)_postInitUser).put("sel", "true");
			getItems.setText("Select".concat(String.valueOf((long)(conter))));
			conter = 1;
			linearDis.setVisibility(View.VISIBLE);
			imageview1.setImageResource(R.drawable.close);
			imageview1.setColorFilter(0xFFE57373, PorterDuff.Mode.MULTIPLY);
			linear9.setVisibility(View.VISIBLE);
			recyclerview2.setAdapter(new Recyclerview2Adapter(files));
			recyclerview2.getAdapter().notifyDataSetChanged();
			zipCuntishen.edit().putString("gozip", "true").commit();
			zipCuntishen.edit().putString("inzip", files.get((int)_postInitUser).get("path").toString()).commit();
		}
	}
	
	
	public void _addproject(final double _number) {
		if (FileUtil.isDirectory(files.get((int)_number).get("path").toString())) {
			var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
			    di.setTitle("Add project?");
			di.setMessage("ایا میخواهید یک پروژه بسازید؟");
			di.setPositiveButton("بله", (p1, d2) -> {
				
				         new AsyncTask<String, String, String>() {
					@Override
					protected void onPreExecute() {
						postTask.setVisibility(View.VISIBLE);
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								try {
									
														new net.lingala.zip4j.ZipFile(files.get((int)_number).get("path").toString().concat("myProject ".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(0), (int)(1375)))).concat("app.project")))).addFolder(new java.io.File(files.get((int)_number).get("path").toString()));
									
												} catch (net.lingala.zip4j.exception.ZipException e) {
														showMessage(e.toString());
												}
							}
						});
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						postTask.setVisibility(View.GONE);
					}
				}.execute("");
				
							});
			di.setNeutralButton("خیر", (p, d) -> {
				
				          
				
							});
			di.show();
			
			
			
			
		}
		else {
			if (FileUtil.isFile(files.get((int)_number).get("path").toString())) {
				var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
				    di.setTitle("Add project?");
				di.setMessage("ایا میخواهید یک پروژه بسازید؟");
				di.setPositiveButton("بله", (p1, d2) -> {
					
					         new AsyncTask<String, String, String>() {
						@Override
						protected void onPreExecute() {
							postTask.setVisibility(View.VISIBLE);
						}
						@Override
						protected String doInBackground(String... params) {
							String _param = params[0];
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									try {
										
																			new net.lingala.zip4j.ZipFile(new java.io.File(files.get((int)_number).get("path").toString().concat("myProject ".concat(String.valueOf((long)(SketchwareUtil.getRandom((int)(0), (int)(1375)))).concat("app.project"))))).addFile(new java.io.File(files.get((int)_number).get("path").toString()));							
										
													} catch (net.lingala.zip4j.exception.ZipException e) {
															showMessage(e.toString());
													}
								}
							});
							return "";
						}
						@Override
						protected void onPostExecute(String _result) {
							postTask.setVisibility(View.GONE);
						}
					}.execute("");
					
								});
				di.setNeutralButton("خیر", (p, d) -> {
					
					          
					
								});
				di.show();
				
				
				
				
			}
		}
	}
	
	
	public void _swifp() {
	}
	public class OnSwipeTouchListener implements View.OnTouchListener {
		
				private final GestureDetector gestureDetector;
		
				public OnSwipeTouchListener(Context ctx) {
						gestureDetector = new GestureDetector(ctx, new GestureListener());
				}
		
				@Override
				public boolean onTouch(View v, MotionEvent event) {
						return gestureDetector.onTouchEvent(event);
				}
		
				private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
			
						private static final int SWIPE_THRESHOLD = 100;
						private static final int SWIPE_VELOCITY_THRESHOLD = 100;
			
						@Override
						public boolean onDown(MotionEvent e) {
								return true;
						}
			
						@Override
						public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
								boolean result = false;
								try {
										float diffY = e2.getY() - e1.getY();
										float diffX = e2.getX() - e1.getX();
										if (Math.abs(diffX) > Math.abs(diffY)) {
												if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
														if (diffX > 0) {
																onSwipeRight();
														} else {
																onSwipeLeft();
														}
														result = true;
												}
										} else if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
												if (diffY > 0) {
														onSwipeBottom();
												} else {
														onSwipeTop();
												}
												result = true;
										}
								} catch (Exception exception) {
										exception.printStackTrace();
								}
								return result;
						}
				}
		
				public void onSwipeRight() {
				}
		
				public void onSwipeLeft() {
				}
		
				public void onSwipeTop() {
				}
		
				public void onSwipeBottom() {
				}
		
		}
	{
	}
	
	
	public void _swinit() {
		linear1.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
			    
			public void onSwipeLeft() {
				if (staticStorage) {
					staticStorage = false;
					Folder = FileUtil.getExternalStorageDir();
					SketchwareUtil.showMessage(getApplicationContext(), FileUtil.getExternalStorageDir());
					_getFiles("");
				}
				else {
					staticStorage = true;
					if (sd_stor.hasRealRemovableSdCarde()) {
						Folder = sd_stor.getExtSdPath();
						SketchwareUtil.showMessage(getApplicationContext(), sd_stor.getExtSdPath());
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "مموری کارت پیدا نشد متاسفم");
					}
					_getFiles("");
				}
			}
			
		});
	}
	
	
	public void _projectinit() {
		maindialogPrfex = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this)
		.setView(R.layout.projectinitre)
		.setTitle("Make project")
		.setCancelable(true)
		.setPositiveButton("make", null)
		.setNegativeButton(android.R.string.cancel, null)
		.create();
		maindialogPrfex.setOnShowListener((var) -> {
				androidx.recyclerview.widget.RecyclerView post = maindialogPrfex.findViewById(R.id.post);
				Button positive = maindialogPrfex.getButton(DialogInterface.BUTTON_POSITIVE);
			    projectdata.clear();
				for(int _repeat20 = 0; _repeat20 < (int)(4); _repeat20++) {
						{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("dontsetMe", "");
								projectdata.add(_item);
						}
						
				}
				post.setAdapter(new RecyclerviewCppAdapter(projectdata));
				post.setLayoutManager(new GridLayoutManager (FiledirActivity.this, (int)2));
				positive.setOnClickListener((vftrororocjj) -> {
						maindialogPrfex.dismiss();
						
				});
		});
		maindialogPrfex.show();
		
	}
	
	
	public void _bindproject() {
	}
	
	public class RecyclerviewCppAdapter extends RecyclerView.Adapter<RecyclerviewCppAdapter.ViewHolder> {
				
				ArrayList<HashMap<String, Object>> _data;
				
				public RecyclerviewCppAdapter(ArrayList<HashMap<String, Object>> _arr) {
						_data = _arr;
				}
				
				@Override
				public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
						LayoutInflater _inflater = getLayoutInflater();
						View _v = _inflater.inflate(R.layout.viewproject, null);
						RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
						_v.setLayoutParams(_lp);
						return new ViewHolder(_v);
				}
				
				@Override
				public void onBindViewHolder(ViewHolder _holder, final int _position) {
						View _view = _holder.itemView;
			         Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.fade_in);
						_view.startAnimation(animation);
						
					       	 final LinearLayout mains = _view.findViewById(R.id.mains);
			final ImageView img = _view.findViewById(R.id.img);
			final TextView tv = _view.findViewById(R.id.tv);
			mains.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(mains);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration((int)5);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(mains);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration((int)5);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(mains);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration((int)5);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(mains);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration((int)5);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
			if (_position == 0) {
				img.setImageResource(R.drawable.projecthtml);
				tv.setText("web project");
				mains.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						_project();
						maindialogPrfex.dismiss();
					}
				});
			}
			if (_position == 1) {
				img.setImageResource(R.drawable.projectnodejs);
				tv.setText("node js project");
				mains.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						maindialogPrfex.dismiss();
					}
				});
			}
			if (_position == 2) {
				img.setImageResource(R.drawable.projectreact);
				tv.setText("react project");
				mains.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						maindialogPrfex.dismiss();
					}
				});
			}
			if (_position == 3) {
				img.setImageResource(R.drawable.projectcpp);
				tv.setText("c++ project");
				mains.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						maindialogPrfex.dismiss();
					}
				});
			}
						
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
	{
	}
	
	public class Recyclerview2Adapter extends RecyclerView.Adapter<Recyclerview2Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.folder, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout mcard = _view.findViewById(R.id.mcard);
			final com.google.android.material.divider.MaterialDivider linear5 = _view.findViewById(R.id.linear5);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear4 = _view.findViewById(R.id.linear4);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final com.google.android.material.checkbox.MaterialCheckBox checkbox1 = _view.findViewById(R.id.checkbox1);
			final ProgressBar progressbar1 = _view.findViewById(R.id.progressbar1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final ProgressBar prograssTask = _view.findViewById(R.id.prograssTask);
			final LinearLayout linear6 = _view.findViewById(R.id.linear6);
			final LinearLayout linear7 = _view.findViewById(R.id.linear7);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView more = _view.findViewById(R.id.more);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final TextView videoSize = _view.findViewById(R.id.videoSize);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			mcard.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					_onClickItem(_position);
				}
			});
			mcard.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View _view) {
					_onLongClickItem(_position);
					return true;
				}
			});
			Token = files.get((int)_position).get("path").toString();
			_clickAnimation(mcard);
			_clickAnimation(linear5);
			_colorpost(textview1);
			textview1.setEllipsize(TextUtils.TruncateAt.MARQUEE);
			textview1.setMarqueeRepeatLimit(-1);
			textview1.setSingleLine(true);
			textview1.setSelected(true);
			textview2.setTextColor(0xFFE0E0E0);
			textview1.setTextColor(0xFFEEEEEE);
			videoSize.setTextColor(0xFFE0E0E0);
			textview2.setTextSize((int)10);
			mcard.setBackgroundColor(Color.TRANSPARENT);
			textview1.setText(Uri.parse(files.get((int)_position).get("path").toString()).getLastPathSegment());
			videoSize.setVisibility(View.GONE);
			prograssTask.setVisibility(View.GONE);
			progressbar1.setVisibility(View.GONE);
			LayoutTransition res10 = new LayoutTransition();
					res10.enableTransitionType(LayoutTransition.CHANGING);
					res10.enableTransitionType(LayoutTransition.APPEARING);
					res10.enableTransitionType(LayoutTransition.DISAPPEARING);
			
			res10.enableTransitionType(LayoutTransition.CHANGE_APPEARING);
					res10.enableTransitionType(LayoutTransition.CHANGE_DISAPPEARING);
					res10.addTransitionListener(new LayoutTransition.TransitionListener() {
							@Override
							public void startTransition(LayoutTransition transition, ViewGroup container, View view,
							int transitionType) {
							}
							@Override
							public void endTransition(LayoutTransition transition, ViewGroup container, View view, int transitionType) {
									if (view != mcard) {
											return;
									}
									view.requestLayout();
							}
					});
					
					mcard.setLayoutTransition(res10);
			if (FileUtil.isDirectory(files.get((int)_position).get("path").toString())) {
				imageview1.setImageResource(R.drawable.folder);
				try{
					if (FileUtil.isDirectory(Token)) {
						textview2.setText(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"));
					}
					else {
						textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
					}
				}catch(Exception e){
					textview2.setText("");
				}
				if (textview1.getText().toString().startsWith(".")) {
					linear2.setAlpha((float)(0.8d));
					imageview1.setAlpha((float)(0.8d));
					textview1.setAlpha((float)(0.8d));
					textview2.setAlpha((float)(0.8d));
				}
				else {
					linear2.setAlpha((float)(1));
					imageview1.setAlpha((float)(1));
					textview1.setAlpha((float)(1));
					textview2.setAlpha((float)(1));
				}
				_listviewViewBinding(textview1, imageview1);
			}
			else {
				if (files.get((int)_position).get("path").toString().endsWith(".html")) {
					textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
					SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_html.svg");
				}
				else {
					if (files.get((int)_position).get("path").toString().endsWith(".css")) {
						SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_css.svg");
						textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
					}
					else {
						if (files.get((int)_position).get("path").toString().endsWith(".js")) {
							textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
							SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_node.svg");
						}
						else {
							if (files.get((int)_position).get("path").toString().endsWith(".svg")) {
								try{
									_gogo(files.get((int)_position).get("path").toString(), imageview1, videoSize);
									
									
									
								}catch(Exception e){
										SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_svg.svg");
								}
								textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
								
								videoSize.setVisibility(View.VISIBLE);
								if (tmp.contains("settmp")) {
									videoSize.setVisibility(View.GONE);
								}
							}
							else {
								if (files.get((int)_position).get("path").toString().endsWith(".png")) {
									BitmapFactory.Options options = new BitmapFactory.Options();
									options.inJustDecodeBounds = true;
									BitmapFactory.decodeFile(Token, options);
									int imageHeight = options.outHeight;
									int imageWidth = options.outWidth;
									
									
									videoSize.setVisibility(View.VISIBLE);
									textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
									videoSize.setText(String.valueOf(imageWidth).concat("x".concat(String.valueOf(imageHeight))));
									Glide.with(getApplicationContext())
									.load(files.get((int)_position).get("path").toString())
									.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
									.listener(new com.bumptech.glide.request.RequestListener<Drawable>() {
										@Override
										public boolean onLoadFailed(com.bumptech.glide.load.engine.GlideException e, Object model,com.bumptech.glide.request.target.Target<Drawable> target, boolean isFirstResource) {
											imageview1.setVisibility(View.GONE);
											progressbar1.setVisibility(View.VISIBLE);
											return false;
										}
										@Override
										public boolean onResourceReady(Drawable resource, Object model,com.bumptech.glide.request.target.Target<Drawable> target, com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource){
											imageview1.setVisibility(View.VISIBLE);
											progressbar1.setVisibility(View.GONE);
											return false;
										}})
									.error(R.drawable.close)
									.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
									.circleCrop()
									.priority(Priority.HIGH)
									.into(imageview1);
									if (tmp.contains("settmp")) {
										videoSize.setVisibility(View.GONE);
									}
								}
								else {
									if (files.get((int)_position).get("path").toString().endsWith(".py")) {
										SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_python.svg");
										textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
									}
									else {
										if (files.get((int)_position).get("path").toString().endsWith(".jar")) {
											textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
											SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_jar.svg");
										}
										else {
											if (files.get((int)_position).get("path").toString().endsWith(".scss")) {
												textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
												SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_scss2.svg");
											}
											else {
												if (files.get((int)_position).get("path").toString().endsWith(".json")) {
													textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
													SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_json2.svg");
												}
												else {
													if (files.get((int)_position).get("path").toString().endsWith(".java")) {
														textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
														SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_java.svg");
													}
													else {
														if (files.get((int)_position).get("path").toString().endsWith(".cpp")) {
															textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
															SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_cpp3.svg");
														}
														else {
															if (files.get((int)_position).get("path").toString().endsWith(".c")) {
																textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_c3.svg");
															}
															else {
																if (files.get((int)_position).get("path").toString().endsWith(".cs")) {
																	textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																	SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_csharp2.svg");
																}
																else {
																	if (files.get((int)_position).get("path").toString().endsWith(".ghost")) {
																		textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																		SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_ink.svg");
																	}
																	else {
																		if (files.get((int)_position).get("path").toString().endsWith(".xml")) {
																			textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																			try {
																					InputStream inputStream = new FileInputStream(Token);
																					VectorMasterDrawable masterDrawable = new VectorMasterDrawable(FiledirActivity.this);
																					masterDrawable.setInputStream(inputStream);
																					if(masterDrawable.isVector()){
																							imageview1.setImageDrawable(masterDrawable);
																					}else{
																							imageview1.setImageResource(R.drawable.errorxml);
																					}
																			} catch (IOException exception) {
																					
																					
																				SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_source.svg");
																			}
																		}
																		else {
																			if (files.get((int)_position).get("path").toString().endsWith(".ninja")) {
																				textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																				SvgShow.GetAsster(getApplicationContext() , imageview1 , "file_type_ninja.svg");
																			}
																			else {
																				if (files.get((int)_position).get("path").toString().endsWith(".sh")) {
																					textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																					SvgShow.GetAsster(getApplicationContext() , imageview1 , "rowbash.svg");
																				}
																				else {
																					if (files.get((int)_position).get("path").toString().endsWith(".md")) {
																						textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																						SvgShow.GetAsster(getApplicationContext() , imageview1 , "mdx.svg");
																					}
																					else {
																						if (files.get((int)_position).get("path").toString().endsWith(".mp3")) {
																							textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																							Glide.with(getApplicationContext())
																							.load(files.get((int)_position).get("path").toString())
																							.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																							.error(R.drawable.musico)
																							.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																							.circleCrop()
																							.priority(Priority.HIGH)
																							.into(imageview1);
																							if (tmp.contains("settmp")) {
																								videoSize.setVisibility(View.GONE);
																							}
																						}
																						else {
																							if (files.get((int)_position).get("path").toString().endsWith(".web")) {
																								imageview1.setImageResource(R.drawable.webproject);
																								textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																							}
																							else {
																								if (files.get((int)_position).get("path").toString().endsWith(".php")) {
																									imageview1.setImageResource(R.drawable.languagephp);
																									textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																								}
																								else {
																									if (files.get((int)_position).get("path").toString().endsWith(".mp4")) {
																										videoSize.setVisibility(View.VISIBLE);
																										textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																										BitmapFactory.Options options = new BitmapFactory.Options();
																										options.inJustDecodeBounds = true;
																										BitmapFactory.decodeFile(Token, options);
																										int imageHeight = options.outHeight;
																										int imageWidth = options.outWidth;
																										
																										
																										Glide.with(getApplicationContext())
																										.load(files.get((int)_position).get("path").toString())
																										.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																										.listener(new com.bumptech.glide.request.RequestListener<Drawable>() {
																											@Override
																											public boolean onLoadFailed(com.bumptech.glide.load.engine.GlideException e, Object model,com.bumptech.glide.request.target.Target<Drawable> target, boolean isFirstResource) {
																												imageview1.setVisibility(View.GONE);
																												progressbar1.setVisibility(View.VISIBLE);
																												return false;
																											}
																											@Override
																											public boolean onResourceReady(Drawable resource, Object model,com.bumptech.glide.request.target.Target<Drawable> target, com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource){
																												imageview1.setVisibility(View.VISIBLE);
																												progressbar1.setVisibility(View.GONE);
																												videoSize.setText(_VideoWhich(files.get((int)_position).get("path").toString()).concat(" , ".concat(_Videohighlights(files.get((int)_position).get("path").toString()))));
																												return false;
																											}})
																										.error(R.drawable.close)
																										.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																										.priority(Priority.HIGH)
																										.circleCrop()
																										.into(imageview1);
																										if (tmp.contains("settmp")) {
																											videoSize.setVisibility(View.GONE);
																										}
																									}
																									else {
																										if (files.get((int)_position).get("path").toString().endsWith(".jpg")) {
																											videoSize.setVisibility(View.VISIBLE);
																											textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																											BitmapFactory.Options options = new BitmapFactory.Options();
																											options.inJustDecodeBounds = true;
																											BitmapFactory.decodeFile(Token, options);
																											int imageHeight = options.outHeight;
																											int imageWidth = options.outWidth;
																											
																											
																											Glide.with(getApplicationContext())
																											.load(files.get((int)_position).get("path").toString())
																											.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																											.listener(new com.bumptech.glide.request.RequestListener<Drawable>() {
																												@Override
																												public boolean onLoadFailed(com.bumptech.glide.load.engine.GlideException e, Object model,com.bumptech.glide.request.target.Target<Drawable> target, boolean isFirstResource) {
																													imageview1.setVisibility(View.GONE);
																													progressbar1.setVisibility(View.VISIBLE);
																													return false;
																												}
																												@Override
																												public boolean onResourceReady(Drawable resource, Object model,com.bumptech.glide.request.target.Target<Drawable> target, com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource){
																													imageview1.setVisibility(View.VISIBLE);
																													progressbar1.setVisibility(View.GONE);
																													videoSize.setText(String.valueOf(imageWidth).concat("x".concat(String.valueOf(imageHeight))));
																													return false;
																												}})
																											.error(R.drawable.close)
																											.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																											.priority(Priority.HIGH)
																											.circleCrop()
																											.into(imageview1);
																											if (tmp.contains("settmp")) {
																												videoSize.setVisibility(View.GONE);
																											}
																										}
																										else {
																											if (Token.endsWith(".apk")) {
																												try { 
																														
																														
																															
																														android.content.pm.PackageManager packageManager = FiledirActivity.this.getPackageManager();
																														android.content.pm.PackageInfo packageInfo = packageManager.getPackageArchiveInfo(Token, 0);
																														packageInfo.applicationInfo.sourceDir = Token;
																														packageInfo.applicationInfo.publicSourceDir = Token;
																														imageview1.setImageDrawable(packageInfo.applicationInfo.loadIcon(packageManager));
																														packageInfo = null;
																														packageManager = null;
																														
																												} catch (Exception e){
																														e.printStackTrace();
																												}
																												textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																											}
																											else {
																												if (Token.endsWith(".tif") || Token.endsWith(".tiff")) {
																													textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																													videoSize.setVisibility(View.VISIBLE);
																													_prots(Token, imageview1, videoSize);
																													if (tmp.contains("settmp")) {
																														videoSize.setVisibility(View.GONE);
																													}
																												}
																												else {
																													if (Token.endsWith(".go")) {
																														textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																														imageview1.setImageResource(R.drawable.languagego);
																													}
																													else {
																														if (Token.endsWith(".txt")) {
																															textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																															imageview1.setImageResource(R.drawable.txtfile);
																														}
																														else {
																															if (Token.endsWith(".pdf")) {
																																imageview1.setImageResource(R.drawable.pdfview);
																																textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																															}
																															else {
																																if (Token.endsWith(".zip") || Token.endsWith(".tar")) {
																																	imageview1.setImageResource(R.drawable.zipandtar);
																																	textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																}
																																else {
																																	if (Token.endsWith(".rar")) {
																																		imageview1.setImageResource(R.drawable.rartarget);
																																		textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																	}
																																	else {
																																		if (Token.endsWith(".kt")) {
																																			textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																			SvgShow.GetAsster(getApplicationContext() , imageview1 , "kotlin.svg");
																																		}
																																		else {
																																			if (Token.endsWith(".rb") || Token.endsWith(".rbw")) {
																																				textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																				SvgShow.GetAsster(getApplicationContext() , imageview1 , "ruby.svg");
																																			}
																																			else {
																																				if (Token.endsWith(".dart")) {
																																					textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																					SvgShow.GetAsster(getApplicationContext() , imageview1 , "dart.svg");
																																				}
																																				else {
																																					if (Token.endsWith(".swift")) {
																																						textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																						SvgShow.GetAsster(getApplicationContext() , imageview1 , "swift.svg");
																																					}
																																					else {
																																						if (Token.endsWith(".gif")) {
																																							textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																							Glide.with(getApplicationContext())
																																							.load(Token)
																																							.transition(com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade((int)600))
																																							.listener(new com.bumptech.glide.request.RequestListener<Drawable>() {
																																								@Override
																																								public boolean onLoadFailed(com.bumptech.glide.load.engine.GlideException e, Object model,com.bumptech.glide.request.target.Target<Drawable> target, boolean isFirstResource) {
																																									imageview1.setVisibility(View.GONE);
																																									progressbar1.setVisibility(View.VISIBLE);
																																									return false;
																																								}
																																								@Override
																																								public boolean onResourceReady(Drawable resource, Object model,com.bumptech.glide.request.target.Target<Drawable> target, com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource){
																																									imageview1.setVisibility(View.VISIBLE);
																																									progressbar1.setVisibility(View.GONE);
																																									return false;
																																								}})
																																							.error(R.drawable.close)
																																							.diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.ALL)
																																							.priority(Priority.HIGH)
																																							.into(imageview1);
																																						}
																																						else {
																																							if (Token.endsWith(".ttf") || Token.endsWith(".otf")) {
																																								textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																								imageview1.setImageResource(R.drawable.fontlookimageview);
																																							}
																																							else {
																																								if (Token.endsWith(".AA")) {
																																									imageview1.setImageResource(R.drawable.resulttheme);
																																									textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																								}
																																								else {
																																									if (Token.endsWith(".project")) {
																																										imageview1.setImageResource(R.drawable.webproject);
																																										textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																									}
																																									else {
																																										videoSize.setVisibility(View.GONE);
																																										SvgShow.GetAsster(getApplicationContext() , imageview1 , "default_file.svg");
																																										textview2.setText(MFileClass.convertBytes(FileUtil.getFileLength(Token)).concat(", ".concat(MFileClass.getLastModifiedOfFile(Token, "HH:mm, dd/MM/yyyy"))));
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if (_data.get((int)_position).get("sel").toString().equals("true")) {
				checkbox1.setChecked(true);
			}
			else {
				checkbox1.setChecked(false);
			}
			checkbox1.setOnClickListener(v->{
					
				
					 if (checkbox1.isChecked()) {
					_data.get((int)_position).put("sel", "true");
					conter++;
					getItems.setText("Select ".concat(String.valueOf((long)(conter))));
				}
				else {
					_data.get((int)_position).put("sel", "false");
					conter--;
					getItems.setText("Select ".concat(String.valueOf((long)(conter))));
				}
			});
			if (Chack) {
				checkbox1.setVisibility(View.VISIBLE);
			}
			else {
				_data.get((int)_position).put("sel", "false");
				checkbox1.setVisibility(View.GONE);
			}
			more.setOnClickListener(v->{
					
				
					 mmenuitempos = new PowerMenu.Builder(FiledirActivity.this)
				.addItem(new PowerMenuItem("تغییر نام"))
				.addItem(new PowerMenuItem("حذف"))
				.addItem(new PowerMenuItem("افزودن به پروژه"))
				.build();//   my telegram channel sketchware95
				mmenuitempos.setAnimation(MenuAnimation.FADE);//   my telegram channel sketchware95
				mmenuitempos.setMenuRadius((float)15);
				mmenuitempos.setShowBackground(false);
				mmenuitempos.setBackgroundColor(0xFF2B2121);
				mmenuitempos.setMenuColor(0xFF2B2122);
				mmenuitempos.setSelectedEffect(true);//   my telegram channel sketchware95
				mmenuitempos.setDivider(new ColorDrawable(0xFFFDA893));
				mmenuitempos.setTextColor(0xFFEEEEEE);//   my telegram channel sketchware95
				mmenuitempos.setSelectedTextColor(0xFFFDA893);
				mmenuitempos.setCircularEffect(CircularEffect.INNER);//   my telegram channel sketchware95
				mmenuitempos.setHeaderView(R.layout.menu);
				mmenuitempos.setTextSize((int)14);
				mmenuitempos.showAsDropDown(more);
				mmenuitempos.setAutoDismiss(true);
				mmenuitempos.setOnMenuItemClickListener(new OnMenuItemClickListener<PowerMenuItem>(){
					   @Override
					     public void onItemClick(int position, PowerMenuItem item){
						          switch((int)position) {
							case ((int)0): {
								_rename(_position);
								break;
							}
							case ((int)1): {
								_delFileCustom(_position);
								break;
							}
							case ((int)2): {
								_addproject(_position);
								break;
							}
						}
					}
				});//   my telegram channel sketchware95
			});
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
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.instettab, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_view.setLayoutParams(_lp);
			textview2.setText(_data.get((int)_position).get("mo").toString());
			if (_position == (treeviewmap.size() - 1)) {
				imageview1.setVisibility(View.GONE);
			}
			textview2.setOnClickListener(v->{
					
				
					 onBackPressed();
			});
			linear2.setOnClickListener(v->{
					
				
					 onBackPressed();
			});
			if (_position == 0) {
				textview2.setVisibility(View.GONE);
				imageview1.setVisibility(View.GONE);
			}
			if (_position == 1) {
				textview2.setVisibility(View.GONE);
				imageview1.setVisibility(View.VISIBLE);
			}
			if (_position == 2) {
				textview2.setText("GhostWebHome");
			}
			textview2.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View _view) {
					var di = new com.google.android.material.dialog.MaterialAlertDialogBuilder(FiledirActivity.this);
					    ViewGroup viewGroup = findViewById(android.R.id.content);
							View dialogview = getLayoutInflater().inflate(R.layout.cutcutdir30101, viewGroup, false);
					EditText tv = dialogview.findViewById(R.id.tv);
					di.setTitle("مسیر فعلی");
					tv.setText(GetTab);
					di.setMessage("شما میتوانید مسیر فعلی را دریافت کنید و در کلیپ برد خودتون کپی کنید");
					tv.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/ghostfont.ttf"), 0);
					tv.setTextColor(0xFFEEEEEE);
					di.setNeutralButton("کپی", (p, d) -> {
						
						         ((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", GetTab));
						SketchwareUtil.showMessage(getApplicationContext(), "Copy Last dir ".concat(GetTab.concat(" to Clipboard ")));
						
									});
					di.setPositiveButton("بستن", (p1, d2) -> {
						
						          
						
									});
					di.setView(dialogview);
					di.show();
					
					
					
					
					return true;
				}
			});
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