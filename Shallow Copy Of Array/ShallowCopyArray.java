class ShallowCopyArray{
	private int length;
	private int height;
	private int width;
	private String[] colors;

	public ShallowCopyArray(int l,int h,int w,String[] color){
		setData(l,h,w,color);

	}//ShallowCopyArray

	public void setData(int l,int h,int w,String[] color){
		this.length=l;
		this.width=w;
		this.height=h;
		this.colors=color;//shallow copy occur here


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