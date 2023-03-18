package io.github.rosemoe.sora.widget;

import android.text.Spannable;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.content.res.AssetManager;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.os.*;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.*;
import android.view.View.*;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import java.util.Locale;
import io.github.rosemoe.sora.widget.EditorColorScheme;
import Ninja.coder.Ghostemane.code.R;
import io.github.rosemoe.sora.data.CompletionItem;
import java.util.*;
import java.util.HashMap;

@SuppressWarnings("CanBeFinal")
class CustomAdGhostWeb extends EditorCompletionAdapter {
	
	@Override
	public int getItemHeight() {
		// 45 dp
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 45,
		getContext().getResources().getDisplayMetrics());
	}
	
	@Override
	public View getView(int pos, View view, ViewGroup parent, boolean isCurrentCursorPosition) {
		if (view == null) {
			view = LayoutInflater.from(getContext()).inflate(R.layout.oneui, parent, false);
		}
		CompletionItem item = getItem(pos);
		MaterialTextView tv = view.findViewById(R.id.res);
		MaterialTextView tv1 = view.findViewById(R.id.tv1);
		MaterialTextView data = view.findViewById(R.id.data);
		LinearLayout display = view.findViewById(R.id.display);
		LinearLayout mob = view.findViewById(R.id.mob);
		var label = Spannable.Factory.getInstance().newSpannable(item.label);
		var prefix = getPrefix();
		var index = TextUtils.indexOf(item.label.toLowerCase(Locale.ROOT), prefix.toLowerCase(Locale.ROOT));
		if (index != -1) {
			label.setSpan(new ForegroundColorSpan(0xFFFF9193), index, index + prefix.length(),
			Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		}
		tv.setText(label);
		AnimUtils.O(view);
		tv = view.findViewById(R.id.iogore);
		tv1.setTextColor(Color.WHITE);
		data.setTextColor(0xFFFFBF94);
		tv.setText(item.desc);
		tv.setSingleLine(true);
        tv1.setTextColor(Color.BLACK);
		tv1.setText(item.desc.subSequence(0, 1));
		String lastItemPost = tv1.getText().toString();
		String lastItemPost2 = tv.getText().toString();
		if (lastItemPost.endsWith("H")) {
			SetBackgroundItem(Color.parseColor("#FFFCB07D"), display);
			data.setText("<Tag>");
			data.setTextColor(0xFFFBB273);
			tv1.setTextColor(Color.BLACK);
		} else if (lastItemPost.endsWith("Q")) {
			data.setText("qualdom");
			data.setTextColor(0xFFFB7393);
		} else if (lastItemPost.endsWith("C")) {
			data.setText("{css}");
			data.setTextColor(0xFF91CCF9);
			SetBackgroundItem(Color.parseColor("#FFFF6F15"), display);
		} else if (lastItemPost.endsWith("K")) {
			SetBackgroundItem(Color.parseColor("#FFB1014D"), display);
			data.setText("key");
		} else if (lastItemPost.endsWith("P")) {
			SetBackgroundItem(Color.parseColor("#FFA614FB"), display);
			data.setText("<?php>");
			data.setTextColor(0xFFF0A2FE);
		} else if (lastItemPost.endsWith("J")) {
			SetBackgroundItem(Color.parseColor("#FFFF4D5A"), display);
			data.setText("{js}");
			data.setTextColor(0xFFFEF0A2);
		}else if(lastItemPost.endsWith("K") || lastItemPost.endsWith("k")){
			SetBackgroundItem(Color.parseColor("#FF6D2FBD"),display);
			data.setText("key");
		}else if(lastItemPost.endsWith("D")|| lastItemPost.endsWith("d") || lastItemPost.endsWith("I")){
			SetBackgroundItem(Color.parseColor("#FFBF2E2E"),display);
			data.setText("Discrapshen");
			data.setTextColor(0xFFDB846F);
		}else if(lastItemPost.endsWith("E") || lastItemPost.endsWith("e")){
			SetBackgroundItem(Color.parseColor("#FFFFA76D"),display);
			data.setText("Enjebol");
			data.setTextColor(0xFF7FFFB0);
		}else if (lastItemPost.endsWith("A") || lastItemPost.endsWith("a")){
			data.setText("Atrabiot");
			SetBackgroundItem(Color.parseColor("#FFFFCA68"),display);
			tv1.setTextColor(Color.parseColor("#FF2D2D2D"));
			data.setTextColor(Color.parseColor("#FFFCCB7D"));
		}else{
			SetBackgroundItem(Color.parseColor("#FFE98C7B"),display);
			tv1.setTextColor(Color.parseColor("#FF2D2D2D"));
			data.setText("");
		}
		view.setTag(pos);
		return view;
	}
	
	protected void SetBackgroundItem(int colors, View view) {
		GradientDrawable pos = new GradientDrawable();
		pos.setColor(colors);
		pos.setCornerRadius((float) 20);
		view.setBackground(pos);
	}
}
