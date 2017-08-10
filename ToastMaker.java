import android.content.Context;
import android.widget.Toast;

/**
 * Created by lich6389 on 2017/7/27.
 */

//与Toast原使用方法相同，目的为防止Toast堆叠.
public class ToastMaker {
    static Toast toast;
    public static final void maketoast(Context context,String msg,int duration)
    {
        if (toast != null)
        {
            toast.setText(msg);
            toast.setDuration(duration);
        }else {
            toast = Toast.makeText(context,msg,duration);
        }
        toast.show();
    }
}
