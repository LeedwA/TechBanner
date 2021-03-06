package banner.ecar.com.ecarbanner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import banner.ecar.com.ecarbannerlib.holder.Holder;


/**
 * Created by Sai on 15/8/4.
 * 网络图片加载例子
 */
public class NetworkImageHolderView implements Holder<String> {
    private ImageView imageView;
    TextView textView;

    @Override
    public View createView(Context context) {
        //你可以通过layout文件来创建，也可以像我一样用代码创建，不一定是Image，任何控件都可以进行翻页
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        View view = LinearLayout.inflate(context, R.layout.item_listview, null);
        textView = (TextView) view.findViewById(R.id.textview);

        return view;
    }

    @Override
    public void UpdateUI(Context context, int position, String data) {
//        imageView.setImageResource(R.drawable.ic_default_adimage);
//        ImageLoader.getInstance().displayImage(data, imageView);
        textView.setText(""+position);
    }
}
