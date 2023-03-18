package Ninja.coder.Ghostemane.code;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.*;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.*;
import androidx.recyclerview.selection.*;
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

public class JsrunerActivity extends BaseCompat {
	
	private String para = "";
	
	private WebView consoleView;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.jsruner);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		consoleView = findViewById(R.id.consoleView);
		consoleView.getSettings().setJavaScriptEnabled(true);
		consoleView.getSettings().setSupportZoom(true);
		
		consoleView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	
	private void initializeLogic() {
		
		
		WebSettings settings = this.consoleView.getSettings();
		settings.setJavaScriptEnabled(true);
		consoleView.setWebChromeClient(new WebChromeClient());
		
		consoleView.setOnLongClickListener(new View.OnLongClickListener() {
				public boolean onLongClick(View view) {
						return true;
				}
		});
		
		para = "<html>\n	<head>\n    <style>\n    body {\n        background-color : black;\n    }\n    </style>\n	</head>\n	<body>\n		<script src=\"eruda.js\">\n		</script>\n		<script>\n		eruda.init(\n                     {\n           defaults: {\n    displaySize: 100,\n    transparency: 1,\n    theme: 'Dracula'\n                      }\n                      })\n		</script>\n		<script>eruda.show()</script>\n		\n		<script>\n        eruda.remove('info')\n		eruda.remove('network')\n		eruda.remove('elements')\n		eruda.remove('resources')\n		eruda.remove('sources')\n		eruda.remove('snippets')\n		</script>\n		\n		\n\n	<script>let consoles = eruda.get('console');\n        11\n        \n       var now =  new Date();\n       var hour = now.getHours();\n       var minute = now.getMinutes();\n       console.log(\"Task Runed in Time \" + hour + \" : \",minute) \n</script>\n	</body>\n</html>\n";
		para = para.replace("11", getIntent().getStringExtra("sendCode"));
		consoleView.loadDataWithBaseURL("file:///android_asset/eruda.js", para, "text/html", "utf-8", (String) null);
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