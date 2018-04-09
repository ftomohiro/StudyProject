package masukura.opst.co.jp.studyproject;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.CheckResult;
import android.support.v4.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainFragment2 extends Fragment{

    private TextView mTextView;
    private String mName = "";
    private @ColorInt int mBackGroundColor = Color.TRANSPARENT;

    private final static String KEY_NAME = "key_name";
    private final static String KEY_BACKGROUND = "key_background_color";

    @CheckResult
    public static MainFragment createInstance(String name, @ColorInt int color) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();

        args.putString(KEY_NAME, name);
        args.putInt(KEY_BACKGROUND, color);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        Bundle args = getArguments();

        if (args != null) {
            mName = args.getString(KEY_NAME);
            mBackGroundColor = args.getInt(KEY_BACKGROUND, Color.TRANSPARENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        super.onCreateView(inflater, container, saveInstanceState);

        return inflater.inflate(R.layout.fragment_main_2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);
        mTextView = (TextView) view.findViewById(R.id.textView2);

        view.setBackgroundColor(mBackGroundColor);
        mTextView.setText(mName);
    }
}
