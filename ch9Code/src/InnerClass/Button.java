package InnerClass;

public class Button {
    private String title;
    private OnClickListener onClickListener;
    public Button(String title){
        this.title=title;

    }
    public String getTitle(){
        return title;
    }
    public void setOnClickListener(OnclickListener onClickListener){
        this.onClickListener=onClickListener;
    }
    public void onClick(){
        this.onClickListener.onClick(this.title);
    }
    public interface On
}
