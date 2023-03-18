package Ninja.coder.Ghostemane.code;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
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
import com.google.android.material.appbar.AppBarLayout;
import com.lxj.xpopup.*;
import com.mukesh.*;
import com.neo.highlight.*;
import com.skydoves.powermenu.*;
import com.tapadoo.alerter.*;
import com.zip4j.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
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
import com.google.android.material.checkbox.MaterialCheckBox;
import androidx.core.widget.NestedScrollView;

public class SettingappActivity extends BaseCompat {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean boolea = false;
	private boolean mbool01 = false;
	private boolean mbool02 = false;
	private boolean mbool03 = false;
	private boolean mbool04 = false;
	
	private ArrayList<String> string = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> c2 = new ArrayList<>();
	
	private NestedScrollView vscroll1;
	private PraramnetLayoutNinja linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout pubilc;
	private LinearLayout linear22;
	private LinearLayout linear14;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout themes;
	private LinearLayout stingkeyboard;
	private LinearLayout keyboard;
	private LinearLayout linear21;
	private TextView textview9;
	private ImageView imageview1;
	private ImageView arrow05;
	private TextView textview10;
	private ImageView imageview7;
	private TextView tvtheme;
	private ImageView imgtheme;
	private ImageView arrow04;
	private TextView textview13;
	private ImageView imageview8;
	private TextView textview14;
	private ImageView imageview3;
	private ImageView arrow03;
	private TextView textview1;
	private ImageView imageview9;
	private TextView tvword;
	private MaterialCheckBox checkbox1;
	private RecyclerView recyclerview1;
	private LinearLayout add;
	private LinearLayout reminderadditem;
	private LinearLayout linear25;
	private LinearLayout size;
	private ImageView arrow02;
	private TextView textview20;
	private ImageView imageview11;
	private TextView textview21;
	private MaterialCheckBox checkbox11;
	private LinearLayout linear27;
	private LinearLayout autotext;
	private ImageView arrow01;
	private TextView textview6;
	private ImageView imageview10;
	private RecyclerView recyclerview2;
	private TextView textview15;
	private MaterialCheckBox checkbox9;
	
	private SharedPreferences word;
	private SharedPreferences line;
	private SharedPreferences mfs;
	private SharedPreferences getvb;
	private SharedPreferences getDrak;
	private SharedPreferences re;
	private Intent intent = new Intent();
	private SharedPreferences war;
	private SharedPreferences kos;
	private SharedPreferences tab100;
	private SharedPreferences setfont;
	private SharedPreferences atx;
	private SharedPreferences ru;
	private SharedPreferences tmp;
	private SharedPreferences auto;
	private SharedPreferences tabimageview;
	private SharedPreferences moalaqfragment;
	private ObjectAnimator mdownObjectAnimator = new ObjectAnimator();
	private SharedPreferences mt300;
	private TimerTask timer;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settingapp);
		initialize(_savedInstanceState);
		initializeLogic();
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
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		pubilc = findViewById(R.id.pubilc);
		linear22 = findViewById(R.id.linear22);
		linear14 = findViewById(R.id.linear14);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		themes = findViewById(R.id.themes);
		stingkeyboard = findViewById(R.id.stingkeyboard);
		keyboard = findViewById(R.id.keyboard);
		linear21 = findViewById(R.id.linear21);
		textview9 = findViewById(R.id.textview9);
		imageview1 = findViewById(R.id.imageview1);
		arrow05 = findViewById(R.id.arrow05);
		textview10 = findViewById(R.id.textview10);
		imageview7 = findViewById(R.id.imageview7);
		tvtheme = findViewById(R.id.tvtheme);
		imgtheme = findViewById(R.id.imgtheme);
		arrow04 = findViewById(R.id.arrow04);
		textview13 = findViewById(R.id.textview13);
		imageview8 = findViewById(R.id.imageview8);
		textview14 = findViewById(R.id.textview14);
		imageview3 = findViewById(R.id.imageview3);
		arrow03 = findViewById(R.id.arrow03);
		textview1 = findViewById(R.id.textview1);
		imageview9 = findViewById(R.id.imageview9);
		tvword = findViewById(R.id.tvword);
		checkbox1 = findViewById(R.id.checkbox1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		add = findViewById(R.id.add);
		reminderadditem = findViewById(R.id.reminderadditem);
		linear25 = findViewById(R.id.linear25);
		size = findViewById(R.id.size);
		arrow02 = findViewById(R.id.arrow02);
		textview20 = findViewById(R.id.textview20);
		imageview11 = findViewById(R.id.imageview11);
		textview21 = findViewById(R.id.textview21);
		checkbox11 = findViewById(R.id.checkbox11);
		linear27 = findViewById(R.id.linear27);
		autotext = findViewById(R.id.autotext);
		arrow01 = findViewById(R.id.arrow01);
		textview6 = findViewById(R.id.textview6);
		imageview10 = findViewById(R.id.imageview10);
		recyclerview2 = findViewById(R.id.recyclerview2);
		textview15 = findViewById(R.id.textview15);
		checkbox9 = findViewById(R.id.checkbox9);
		word = getSharedPreferences("word", Activity.MODE_PRIVATE);
		line = getSharedPreferences("line", Activity.MODE_PRIVATE);
		mfs = getSharedPreferences("mfs", Activity.MODE_PRIVATE);
		getvb = getSharedPreferences("getvb", Activity.MODE_PRIVATE);
		getDrak = getSharedPreferences("getDrak", Activity.MODE_PRIVATE);
		re = getSharedPreferences("re", Activity.MODE_PRIVATE);
		war = getSharedPreferences("war", Activity.MODE_PRIVATE);
		kos = getSharedPreferences("kos", Activity.MODE_PRIVATE);
		tab100 = getSharedPreferences("tab100", Activity.MODE_PRIVATE);
		setfont = getSharedPreferences("setfont", Activity.MODE_PRIVATE);
		atx = getSharedPreferences("atx", Activity.MODE_PRIVATE);
		ru = getSharedPreferences("ru", Activity.MODE_PRIVATE);
		tmp = getSharedPreferences("tmp", Activity.MODE_PRIVATE);
		auto = getSharedPreferences("auto", Activity.MODE_PRIVATE);
		tabimageview = getSharedPreferences("tabimageview", Activity.MODE_PRIVATE);
		moalaqfragment = getSharedPreferences("moalaqfragment", Activity.MODE_PRIVATE);
		mt300 = getSharedPreferences("mt300", Activity.MODE_PRIVATE);
		
		themes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AnjctorcolorActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(intent);
			}
		});
		
		keyboard.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ResultActivity.class);
				startActivity(intent);
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				onBackPressed();
			}
		});
		
		arrow05.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!mbool01) {
					mbool01 = true;
					_animdown(arrow05);
					themes.setVisibility(View.GONE);
					
				}
				else {
					mbool01 = false;
					_animup(arrow05);
					themes.setVisibility(View.VISIBLE);
					
				}
			}
		});
		
		tvtheme.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), AnjctorcolorActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				startActivity(intent);
			}
		});
		
		arrow04.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!mbool02) {
					mbool02 = true;
					_animdown(arrow04);
					keyboard.setVisibility(View.GONE);
					
				}
				else {
					mbool02 = false;
					_animup(arrow04);
					keyboard.setVisibility(View.VISIBLE);
					
				}
			}
		});
		
		arrow03.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!mbool03) {
					mbool03 = true;
					_animdown(arrow03);
					recyclerview1.setVisibility(View.GONE);
				}
				else {
					mbool03 = false;
					_animup(arrow03);
					recyclerview1.setVisibility(View.VISIBLE);
				}
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					word.edit().putString("getword", "true").commit();
					_ShowIn(checkbox1);
				}
				else {
					word.edit().putString("getword", "false").commit();
					_ShowOut(checkbox1);
				}
			}
		});
		
		arrow02.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!mbool04) {
					mbool04 = true;
					_animdown(arrow02);
					size.setVisibility(View.GONE);
					
				}
				else {
					mbool04 = false;
					_animup(arrow02);
					size.setVisibility(View.VISIBLE);
				}
			}
		});
		
		checkbox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					tmp.edit().putString("settmp", "true").commit();
				}
				else {
					tmp.edit().remove("settmp").commit();
				}
			}
		});
		
		arrow01.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!boolea) {
					boolea = true;
					_animdown(arrow01);
					recyclerview2.setVisibility(View.GONE);
				}
				else {
					boolea = false;
					_animup(arrow01);
					recyclerview2.setVisibility(View.VISIBLE);
				}
			}
		});
		
		checkbox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					_ShowIn(checkbox9);
					kos.edit().putString("vop", "true").commit();
				}
				else {
					kos.edit().putString("vop", "false").commit();
					_ShowOut(checkbox9);
				}
			}
		});
	}
	
	private void initializeLogic() {
		_seechackswich();
		string.add("4");
		string.add("6");
		string.add("8");
		string.add("16");
		
		_toolbar.setBackgroundColor(0xFF2B2121);
		_toolbar.setVisibility(View.GONE);
		if (war.contains("val")) {
			
				Drawable drawable = WallpaperManager.getInstance(SettingappActivity.this).getDrawable();
				if (drawable != null) {
						vscroll1.setBackgroundDrawable(drawable);
				}
			
			
		}
		imgtheme.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
		imageview3.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
		imageview8.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
		imageview9.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
		imageview10.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
		 if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
				      
			       tvtheme.setText("عدم سازگاری با اندروید شما" );
			tvtheme.setTextColor(Color.RED);
			themes.setEnabled(false);
			tvtheme.setEnabled(false);
			imgtheme.setEnabled(false);
					        
				    } else {
				    
			           themes.setEnabled(true);
			tvtheme.setEnabled(true);
			imgtheme.setEnabled(true);  
				    }
		recyclerview2.setVisibility(View.GONE);
		recyclerview1.setVisibility(View.GONE);
		themes.setVisibility(View.GONE);
		keyboard.setVisibility(View.GONE);
		size.setVisibility(View.GONE);
	}
	
	public void _seechackswich() {
		for(int _repeat98 = 0; _repeat98 < (int)(2); _repeat98++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("c", "");
				mp.add(_item);
			}
			
		}
		recyclerview1.setAdapter(new Recyclerview1Adapter(mp));
		recyclerview1.setLayoutManager(new LinearLayoutManager(this));
		if (word.getString("getword", "").equals("true")) {
			checkbox1.setChecked(true);
		}
		else {
			checkbox1.setChecked(false);
		}
		if (kos.getString("vop", "").equals("true")) {
			checkbox9.setChecked(true);
		}
		else {
			checkbox9.setChecked(false);
		}
		for(int _repeat102 = 0; _repeat102 < (int)(8); _repeat102++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("c", "");
				c2.add(_item);
			}
			
		}
		recyclerview2.setAdapter(new Recyclerview2Adapter(c2));
		recyclerview2.setLayoutManager(new LinearLayoutManager(this));
	}
	
	
	public void _ShowIn(final View _v) {
		
	}
	
	
	public void _ShowOut(final View _v) {
		
	}
	
	
	public void _editortabsize(final String _post) {
		if (_post.equals("4")) {
			tab100.edit().putString("mpcnullgogo", "4").commit();
		}
		else {
			if (_post.equals("6")) {
				tab100.edit().putString("mpcnullgogo", "6").commit();
			}
			else {
				if (_post.equals("8")) {
					tab100.edit().putString("mpcnullgogo", "8").commit();
				}
				else {
					if (_post.equals("16")) {
						tab100.edit().putString("mpcnullgogo", "16").commit();
					}
				}
			}
		}
	}
	
	
	public void _jonifile(final EditText _ed) {
		build = new com.google.android.material.dialog.MaterialAlertDialogBuilder(this);
		
		build.setPositiveButton("Exit", (v, o) -> {
				
		});
		build.setTitle("Set font(tiff)");
		
		build.setCancelable(false);
		
		alertoo = build.create();
		
		final ArrayList<String> listStr = new ArrayList<String>();
		
		path = "/storage/emulated/0/";
		
		final LinearLayout container = new LinearLayout(getApplicationContext());
		container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
		LinearLayout.LayoutParams.MATCH_PARENT));
		container.setOrientation(LinearLayout.VERTICAL);
		container.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
		
		final LinearLayout header = new LinearLayout(getApplicationContext());
		header.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
		LinearLayout.LayoutParams.WRAP_CONTENT));
		header.setOrientation(LinearLayout.VERTICAL);
		header.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
		header.setPadding(5, 5, 5, 5);
		
		final TextView edit = new TextView(getApplicationContext());
		edit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
		LinearLayout.LayoutParams.WRAP_CONTENT));
		
		edit.setTextSize(14);
		edit.setTextIsSelectable(true);
		edit.setText("");
		
		edit.setTextColor(0xFFFFFFFF);
		
		final ListView List = new ListView(getApplicationContext());
		List.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
		LinearLayout.LayoutParams.WRAP_CONTENT, 1));
		
		final LinearLayout options = new LinearLayout(getApplicationContext());
		options.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
		LinearLayout.LayoutParams.WRAP_CONTENT));
		options.setOrientation(LinearLayout.HORIZONTAL);
		options.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
		
		final Button back = new Button(getApplicationContext());
		back.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
		LinearLayout.LayoutParams.WRAP_CONTENT));
		back.setPadding(8, 8, 8, 8);
		back.setText("Back");
		back.setTextSize(13);
		
		final Button home = new Button(getApplicationContext());
		home.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
		LinearLayout.LayoutParams.WRAP_CONTENT));
		home.setPadding(8, 8, 8, 8);
		home.setText("home");
		home.setTextSize(13);
		
		final Button select = new Button(getApplicationContext());
		select.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
		LinearLayout.LayoutParams.WRAP_CONTENT));
		select.setPadding(8, 8, 8, 8);
		select.setText("done");
		select.setTextSize(13);
		select.setVisibility(View.INVISIBLE);
		
		open(listStr, path);
		
		{
				GradientDrawable GG = new GradientDrawable();
				GG.setColor(R.color.colorAccent);
				GG.setCornerRadius((float) 60);
				GG.setStroke((int) 1, R.color.colorPrimary);
				RippleDrawable RE = new RippleDrawable(
				new ColorStateList(new int[][] { new int[] {} }, new int[] { Color.parseColor("#FFFE8CD2") }), GG,
				null);
				back.setBackground(GG);
				home.setBackground(GG);
				select.setBackground(GG);
				back.setTextColor(Color.WHITE);
				home.setTextColor(Color.WHITE);
				select.setTextColor(Color.WHITE);
				back.setTypeface(Typeface.MONOSPACE);
				home.setTypeface(Typeface.MONOSPACE);
				select.setTypeface(Typeface.MONOSPACE);
				
				back.setClickable(true);
				home.setClickable(true);
				select.setClickable(true);
				select.setOnTouchListener(new View.OnTouchListener() {
						@Override
						public boolean onTouch(View v, MotionEvent event) {
								switch (event.getAction()) {
										case MotionEvent.ACTION_DOWN: {
												ObjectAnimator scaleX = new ObjectAnimator();
												scaleX.setTarget(select);
												scaleX.setPropertyName("scaleX");
												scaleX.setFloatValues(0.9f);
												scaleX.setDuration((int) 5);
												scaleX.start();
												
												ObjectAnimator scaleY = new ObjectAnimator();
												scaleY.setTarget(select);
												scaleY.setPropertyName("scaleY");
												scaleY.setFloatValues(0.9f);
												scaleY.setDuration((int) 5);
												scaleY.start();
												break;
										}
										case MotionEvent.ACTION_UP: {
												
												ObjectAnimator scaleX = new ObjectAnimator();
												scaleX.setTarget(select);
												scaleX.setPropertyName("scaleX");
												scaleX.setFloatValues((float) 1);
												scaleX.setDuration((int) 5);
												scaleX.start();
												
												ObjectAnimator scaleY = new ObjectAnimator();
												scaleY.setTarget(select);
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
				back.setOnTouchListener(new View.OnTouchListener() {
						@Override
						public boolean onTouch(View v, MotionEvent event) {
								switch (event.getAction()) {
										case MotionEvent.ACTION_DOWN: {
												ObjectAnimator scaleX = new ObjectAnimator();
												scaleX.setTarget(back);
												scaleX.setPropertyName("scaleX");
												scaleX.setFloatValues(0.9f);
												scaleX.setDuration((int) 5);
												scaleX.start();
												
												ObjectAnimator scaleY = new ObjectAnimator();
												scaleY.setTarget(back);
												scaleY.setPropertyName("scaleY");
												scaleY.setFloatValues(0.9f);
												scaleY.setDuration((int) 5);
												scaleY.start();
												break;
										}
										case MotionEvent.ACTION_UP: {
												
												ObjectAnimator scaleX = new ObjectAnimator();
												scaleX.setTarget(back);
												scaleX.setPropertyName("scaleX");
												scaleX.setFloatValues((float) 1);
												scaleX.setDuration((int) 5);
												scaleX.start();
												
												ObjectAnimator scaleY = new ObjectAnimator();
												scaleY.setTarget(back);
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
				
				home.setOnTouchListener(new View.OnTouchListener() {
						@Override
						public boolean onTouch(View v, MotionEvent event) {
								switch (event.getAction()) {
										case MotionEvent.ACTION_DOWN: {
												ObjectAnimator scaleX = new ObjectAnimator();
												scaleX.setTarget(home);
												scaleX.setPropertyName("scaleX");
												scaleX.setFloatValues(0.9f);
												scaleX.setDuration((int) 5);
												scaleX.start();
												
												ObjectAnimator scaleY = new ObjectAnimator();
												scaleY.setTarget(home);
												scaleY.setPropertyName("scaleY");
												scaleY.setFloatValues(0.9f);
												scaleY.setDuration((int) 5);
												scaleY.start();
												break;
										}
										case MotionEvent.ACTION_UP: {
												
												ObjectAnimator scaleX = new ObjectAnimator();
												scaleX.setTarget(home);
												scaleX.setPropertyName("scaleX");
												scaleX.setFloatValues((float) 1);
												scaleX.setDuration((int) 5);
												scaleX.start();
												
												ObjectAnimator scaleY = new ObjectAnimator();
												scaleY.setTarget(home);
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
				
		}
		DisplayMetrics displayMetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
		int height = displayMetrics.heightPixels;
		int width = displayMetrics.widthPixels;
		List.setDividerHeight(0);
		List.setHorizontalScrollBarEnabled(false);
		List.setVerticalScrollBarEnabled(false);
		container.setMinimumHeight(height);
		container.setMinimumWidth(width);
		
		final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
		android.R.layout.simple_list_item_1, listStr) {
				@Override
				public View getView(int _position, View convertView, ViewGroup parent) {
						View view = super.getView(_position, convertView, parent);
						
						view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.MATCH_PARENT, 1));
						
						TextView tv = (TextView) view.findViewById(android.R.id.text1);
						tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.MATCH_PARENT, 1));
						tv.setTypeface(Typeface.MONOSPACE);
						
						tv.setTextColor(0xFFFFFFFF);
						
						if (FileUtil.isDirectory(listStr.get((int) (_position)))) {
								tv.setText("📂  ".concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
						} else {
								if (FileUtil.isFile(listStr.get((int) (_position)))) {
										tv.setText("📄  ".concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
								}
						}
						
						ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f,
						Animation.RELATIVE_TO_SELF, 0.7f);
						fade_in.setDuration(300);
						fade_in.setFillAfter(true);
						tv.startAnimation(fade_in);
						
						return view;
				}
		};
		List.setAdapter(arrayAdapter);
		((BaseAdapter) List.getAdapter()).notifyDataSetChanged();
		
		back.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
						if (!(path.equals("/storage/emulated/0") || path.equals("/sdcard"))) {
								String UpFolder = path.substring((int) (0), (int) (path.lastIndexOf("/")));
								path = UpFolder;
								
								edit.setText("");
								
								open(listStr, path);
								final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
								android.R.layout.simple_list_item_1, listStr) {
										@Override
										public View getView(int _position, View convertView, ViewGroup parent) {
												View view = super.getView(_position, convertView, parent);
												
												view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
												LinearLayout.LayoutParams.MATCH_PARENT, 1));
												
												TextView tv = (TextView) view.findViewById(android.R.id.text1);
												tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
												LinearLayout.LayoutParams.MATCH_PARENT, 1));
												tv.setTypeface(Typeface.MONOSPACE);
												
												tv.setTextColor(0xFFFFFFFF);
												
												if (FileUtil.isDirectory(listStr.get((int) (_position)))) {
														tv.setText(
														"📂  ".concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
												} else {
														if (FileUtil.isFile(listStr.get((int) (_position)))) {
																tv.setText("📄  "
																.concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
														}
												}
												
												ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF,
												0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
												fade_in.setDuration(300);
												fade_in.setFillAfter(true);
												tv.startAnimation(fade_in);
												
												return view;
												
										}
								};
								List.setAdapter(arrayAdapter);
								((BaseAdapter) List.getAdapter()).notifyDataSetChanged();
								
						}
				}
		});
		home.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
						path = "/storage/emulated/0/";
						edit.setText("");
						
						open(listStr, path);
						final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
						android.R.layout.simple_list_item_1, listStr) {
								@Override
								public View getView(int _position, View convertView, ViewGroup parent) {
										View view = super.getView(_position, convertView, parent);
										
										view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
										LinearLayout.LayoutParams.MATCH_PARENT, 1));
										
										TextView tv = (TextView) view.findViewById(android.R.id.text1);
										tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
										LinearLayout.LayoutParams.MATCH_PARENT, 1));
										tv.setTypeface(Typeface.MONOSPACE);
										
										tv.setTextColor(0xFFFFFFFF);
										if (FileUtil.isDirectory(listStr.get((int) (_position)))) {
												tv.setText("📂  ".concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
										} else {
												if (FileUtil.isFile(listStr.get((int) (_position)))) {
														tv.setText(
														"📄  ".concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
												}
										}
										
										ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF,
										0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
										fade_in.setDuration(300);
										fade_in.setFillAfter(true);
										tv.startAnimation(fade_in);
										
										return view;
								}
						};
						List.setAdapter(arrayAdapter);
						((BaseAdapter) List.getAdapter()).notifyDataSetChanged();
						
				}
		});
		select.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
						
						_ed.setText(selectedFile);
						
						alertoo.dismiss();
				}
		});
		List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
						
						java.io.File check = new java.io.File(listStr.get(position));
						
						if (check.isDirectory()) {
								
								path = listStr.get(position);
								
								select.setVisibility(View.INVISIBLE);
								open(listStr, path);
								
								final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
								android.R.layout.simple_list_item_1, listStr) {
										@Override
										public View getView(int _position, View convertView, ViewGroup parent) {
												View view = super.getView(_position, convertView, parent);
												
												view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
												LinearLayout.LayoutParams.MATCH_PARENT, 1));
												
												TextView tv = (TextView) view.findViewById(android.R.id.text1);
												tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
												LinearLayout.LayoutParams.MATCH_PARENT, 1));
												tv.setTypeface(Typeface.MONOSPACE);
												
												tv.setTextColor(0xFFFFFFFF);
												
												if (FileUtil.isDirectory(listStr.get((int) (_position)))) {
														tv.setText(
														"📂  ".concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
												} else {
														if (FileUtil.isFile(listStr.get((int) (_position)))) {
																tv.setText("📄  "
																.concat(Uri.parse(listStr.get((int) (_position))).getLastPathSegment()));
														}
												}
												
												ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF,
												0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
												fade_in.setDuration(300);
												fade_in.setFillAfter(true);
												tv.startAnimation(fade_in);
												
												return view;
										}
								};
								List.setAdapter(arrayAdapter);
								((BaseAdapter) List.getAdapter()).notifyDataSetChanged();
								
						} else {
								
								List.setSelector(android.R.color.transparent);
								android.graphics.drawable.GradientDrawable style = new android.graphics.drawable.GradientDrawable();
								
								style.setColor(Color.parseColor("#2196F3"));
								
								style.setCornerRadius(1);
								List.setSelector(style);
								
								selectedFile = listStr.get(position);
								
								edit.setText("selected file : " + selectedFile);
								
								select.setVisibility(View.VISIBLE);
								
						}
						
				}
		});
		
		header.addView(edit);
		container.addView(header);
		container.addView(List);
		options.addView(back);
		options.addView(home);
		options.addView(select);
		container.addView(options);
		
		alertoo.setView(container);
		
		alertoo.show();
		
	}
	
	private boolean isDark = false;
	private String selectedFile = "";
	private androidx.appcompat.app.AlertDialog alertoo;
	
	private void open(ArrayList<String> strings, String wech) {
			
			strings.clear();
			
			FileUtil.listDir(wech, strings);
			
			final class FileComparator implements Comparator<String> {
					public int compare(String f1, String f2) {
							if (f1 == f2)
							return 0;
							if (FileUtil.isDirectory(f1) && FileUtil.isFile(f2))
							return -1;
							if (FileUtil.isFile(f1) && FileUtil.isDirectory(f2))
							return 1;
							return f1.compareToIgnoreCase(f2);
					}
			}
			Collections.sort(strings, new FileComparator());
	}
	
	private String path;
	private com.google.android.material.dialog.MaterialAlertDialogBuilder build;
	{
			
			
	}
	
	
	public void _animdown(final ImageView _mimg) {
		mdownObjectAnimator.setTarget(_mimg);
		mdownObjectAnimator.setPropertyName("rotation");
		mdownObjectAnimator.setFloatValues((float)(0));
		mdownObjectAnimator.setFloatValues((float)(0), (float)(180));
		mdownObjectAnimator.setRepeatMode(ValueAnimator.RESTART);
		mdownObjectAnimator.start();
	}
	
	
	public void _animup(final View _mimg) {
		mdownObjectAnimator.setTarget(_mimg);
		mdownObjectAnimator.setPropertyName("rotation");
		mdownObjectAnimator.setFloatValues((float)(180));
		mdownObjectAnimator.setFloatValues((float)(180), (float)(0));
		mdownObjectAnimator.setRepeatMode(ValueAnimator.RESTART);
		mdownObjectAnimator.start();
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.mp1, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final Switch switch1 = _view.findViewById(R.id.switch1);
			
			switch1.setTextColor(0xFFEEEEEE);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
				_view.setLayoutParams(_lp);
			if (_position == 0) {
				if (line.contains("getline")) {
					switch1.setChecked(true);
				}
				switch1.setText("ثابت کردن اعداد شمارشی");
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							line.edit().putString("getline", "true").commit();
						}
						else {
							line.edit().remove("getline").commit();
						}
					}});
			}
			if (_position == 1) {
				if (getvb.contains("HsiGamer")) {
					switch1.setChecked(true);
				}
				switch1.setText("لرزش");
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							getvb.edit().putString("HsiGamer", "true").commit();
						}
						else {
							getvb.edit().remove("HsiGamer").commit();
						}
					}});
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
	
	public class Recyclerview2Adapter extends RecyclerView.Adapter<Recyclerview2Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.mp2, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout box = _view.findViewById(R.id.box);
			final LinearLayout text = _view.findViewById(R.id.text);
			final Switch switch1 = _view.findViewById(R.id.switch1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			text.setVisibility(View.GONE);
			switch1.setTextColor(0xFFEEEEEE);
			textview1.setTextColor(0xFFEEEEEE);
			imageview1.setColorFilter(0xFFFDA893, PorterDuff.Mode.MULTIPLY);
			if (_position == 0) {
				if (auto.contains("mauto")) {
					switch1.setChecked(true);
				}
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							auto.edit().putString("mauto", "true").commit();
						}
						else {
							auto.edit().remove("mauto").commit();
						}
					}});
				switch1.setText("تکمیل کننده متن را دستی کنید");
			}
			if (_position == 1) {
				if (tabimageview.contains("mtab")) {
					switch1.setChecked(true);
				}
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							tabimageview.edit().putString("mtab", "true").commit();
						}
						else {
							tabimageview.edit().remove("mtab").commit();
						}
					}});
				switch1.setText("ایکون های پنجره را خاموش کنید");
			}
			if (_position == 2) {
				if (moalaqfragment.contains("mpost")) {
					switch1.setChecked(true);
				}
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							moalaqfragment.edit().putString("mpost", "true").commit();
						}
						else {
							moalaqfragment.edit().remove("mpost").commit();
						}
					}});
				switch1.setText("صفحه معلق را فعال کنید");
			}
			if (_position == 3) {
				if (re.contains("f380")) {
					switch1.setChecked(true);
				}
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							re.edit().putString("f380", "true").commit();
						}
						else {
							re.edit().remove("f380").commit();
						}
					}});
				switch1.setText("خطوط کد ادیتور را فعال کنید");
			}
			if (_position == 4) {
				if (war.contains("val")) {
					switch1.setChecked(true);
				}
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							
								Drawable drawable = WallpaperManager.getInstance(SettingappActivity.this).getDrawable();
								if (drawable != null) {
										vscroll1.setBackgroundDrawable(drawable);
								}
							
							
							war.edit().putString("val", "true").commit();
							SketchwareUtil.showMessage(getApplicationContext(), "اعمال شد دوباره وارد برنامه شوید");
						}
						else {
							war.edit().remove("val").commit();
							vscroll1.setBackgroundColor(0xFF2B2122);
							SketchwareUtil.showMessage(getApplicationContext(), "خاموش شد دوباره وارد برنامه شوید");
						}
					}});
				switch1.setText("دریافت پس زمینه");
			}
			if (_position == 5) {
				if (ru.contains("rup")) {
					switch1.setChecked(true);
				}
				switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
						if (isChecked) {
							ru.edit().putString("rup", "true").commit();
						}
						else {
							ru.edit().remove("rup").commit();
						}
					}});
				switch1.setText("تم پیشفرض را فعال کنید");
			}
			if (_position == 6) {
				text.setVisibility(View.VISIBLE);
				text.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						{
							final String[] array = string.toArray(new String[0]);
							final String[] chosen = {""};
							com.google.android.material.dialog.MaterialAlertDialogBuilder builder = new com.google.android.material.dialog.MaterialAlertDialogBuilder(SettingappActivity.this);
							builder.setCancelable(false);
							        //builder.setIcon(R.drawable.icon);
							        builder.setTitle("Select");
							        builder.setSingleChoiceItems(array, -1, new DialogInterface
							                .OnClickListener() {
								            public void onClick(DialogInterface dialog, int item) {
									              
									              chosen[0] = array[item];
									              
									            }
								        });
							        
							        builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialog, int _which) {
									
									
											
									}
							});
							
							builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
									
									
											
									}
							});
							
							        final androidx.appcompat.app.AlertDialog alert = builder.create();
							        alert.show();
							
							alert.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
							 { 
									 @Override
									 public void onClick(View v)
									 {
											 Boolean wantToCloseDialog = false;
									
									
									String item = chosen[0];
									if (item.isEmpty()){
										
									} else {
										////YourCodeType
										_editortabsize(item);
										alert.dismiss();
									}
											 if(wantToCloseDialog) {
													 
													 }
											 }
									 });
							
						}
					}
				});
				textview1.setText("سایز فاصله را مشخص کنید");
				imageview1.setImageResource(R.drawable.alls);
				box.setVisibility(View.GONE);
			}
			if (_position == 7) {
				text.setVisibility(View.VISIBLE);
				box.setVisibility(View.GONE);
				textview1.setText("فونت را شخصی سازی کنید");
				imageview1.setImageResource(R.drawable.mfont);
				text.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						androidx.appcompat.app.AlertDialog dialog = new com.google.android.material.dialog.MaterialAlertDialogBuilder(SettingappActivity.this)
						
						    .setView(R.layout.fontsetlector)
						.setTitle("فونت شخصی")
						.setMessage("لطفا دقت کنید که حتمان باید فرمت فونت .ttf باشد در غیر این صورت با خطا برنامه متوجه میشوید")
						.setCancelable(true)
						.setPositiveButton("تایید", null)
						.setNegativeButton(android.R.string.cancel, null)
						.setNeutralButton("پیشفرض",null)
						.create();
						dialog.setOnShowListener((var) -> {
							
							       Button positive = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
							Button np = dialog.getButton(android.content.DialogInterface.BUTTON_NEUTRAL);
							com.google.android.material.textfield.TextInputLayout input = dialog.findViewById(R.id.input);		
							
							EditText edit = dialog.findViewById(R.id.edit);		
							
							input.setEndIconDrawable(R.drawable.jvrfont);
							input.setEndIconVisible(true);
							input.setEndIconCheckable(true);
							input.setEndIconOnClickListener(v ->{
											
											_jonifile(edit);
								
									});
							
							if (edit.getText().toString().isEmpty()) {
								positive.setEnabled(false);
							}
							else {
								positive.setEnabled(true);
							}
							positive.setOnClickListener((vftrororocjj) -> {
								
								             setfont.edit().putString("mfont", edit.getText().toString()).commit();
								dialog.dismiss();
								SketchwareUtil.CustomToast(getApplicationContext(), "فونت : ".concat(edit.getText().toString().trim().concat(" اعمال شد")), 0xFFFDA893, 14, 0xFF1F1B1C, 15, SketchwareUtil.CENTER);
												
										});
							edit.addTextChangedListener(new android.text.TextWatcher() {
												@Override
												public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
														final String _charSeq = _param1.toString();
												         
									              if (edit.getText().toString().isEmpty()) {
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
							np.setOnClickListener((vftrororocjj) -> {
								
								             setfont.edit().remove("mfont").commit();
								dialog.dismiss();
								SketchwareUtil.CustomToast(getApplicationContext(), "فونت پیشفرض اعمال شد", 0xFFFDA893, 14, 0xFF1F1B1C, 15, SketchwareUtil.CENTER);
								SketchwareUtil.showMessage(getApplicationContext(), "فونت پیشفرض اعمال شد");
												
										});
						});
						dialog.show();
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