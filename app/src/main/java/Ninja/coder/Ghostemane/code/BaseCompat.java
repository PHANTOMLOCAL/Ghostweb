package Ninja.coder.Ghostemane.code;

import android.content.pm.PackageManager;
import android.Manifest;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.io.File;

public class BaseCompat extends AppCompatActivity {
	protected static String color = "#FF2B2122";
	protected static int SDKINT = Build.VERSION.SDK_INT;
	protected static int SDKVERSION = Build.VERSION_CODES.LOLLIPOP;
	protected AlertDialog db;
	protected File file;
	protected MaterialAlertDialogBuilder dialogerror;
	protected GradientDrawable gb = new GradientDrawable();
	
	@Deprecated
	@Nullable
	@Override
	protected void onCreate(@Nullable Bundle saveInStatous) {
		super.onCreate(saveInStatous);
		status();
	}
	
	protected BaseCompat status() {
		if (SDKINT > SDKVERSION) {
			Window window = getWindow();
			window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			window.setStatusBarColor(Color.parseColor(color));
			window.setNavigationBarColor(Color.parseColor(color));
		}
		BaseCompat.this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor(color)));
		return this;
	}
	
	public BaseCompat typefaceAsster(EditText editText, String typeNameFont) {
		editText.setTypeface(Typeface.createFromAsset(getAssets(), typeNameFont));
		return this;
	}
	
	public BaseCompat typefaceAsster(TextView editText, String typeNameFont) {
		editText.setTypeface(Typeface.createFromAsset(getAssets(), typeNameFont));
		return this;
	}
	
	public BaseCompat typefaceinFile(TextView textView, File file) {
		textView.setTypeface(Typeface.createFromFile(file));
		return this;
	}
	
	public BaseCompat typefaceinFile(EditText textView, File file) {
		
		textView.setTypeface(Typeface.createFromFile(file));
		return this;
	}
	
	protected BaseCompat dialogColor(int color, MaterialAlertDialogBuilder dialogBuilder, int Stoker) {
		gb.setColor(color);
		gb.setStroke(1, Stoker);
		gb.setCornerRadius((float) 20);
		dialogBuilder.setBackground(gb);
		return this;
	}
	
	public BaseCompat dialogErrors(String title, String msg) {
		dialogerror = new MaterialAlertDialogBuilder(BaseCompat.this);
		dialogerror.setTitle(title);
		dialogerror.setMessage(msg);
		dialogerror.setPositiveButton("exit", (d, v) -> {
			finishAffinity();
		});
		dialogColor(Color.RED, dialogerror, Color.BLACK);
		dialogerror.show();
		return this;
	}
	public BaseCompat pass(){
		return this;
	}
}
