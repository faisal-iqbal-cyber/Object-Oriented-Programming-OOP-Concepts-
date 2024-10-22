class DeepCopyArray{
	private int length;
	private int height;
	private int width;
	private String[] colors;

	public DeepCopyArray(int l,int h,int w,String[] color){
		setData(l,h,w,color);

	}//ShallowCopyArray

	public void setData(int l,int h,int w,String[] color){
		this.length=l;
		this.width=w;
		this.height=h;
		this.colors=new String[color.length];
		for(int i=0;i<colors.length;i++){
		this.colors[i]=color[i];   //Deep copy occur here

	}

	}
	public void print(){
		System.out.println("The length is "+length);
		System.out.println("The height is "+height);
		System.out.println("the width is "+width);
		for(int i=0;i<colors.length;i++){
			System.out.print(colors[i]+" ");
		}

	}
	void changeColor(){
		this.colors[0]="Black";

		}
	
}