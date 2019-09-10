public class Sorting {
	Subject [] subjects;
	int eSize;
	
	public Sorting(int size) {
		this.eSize = 0;
		this.subjects = new Subject[size];
	}
	
	public void insert(Subject s) {
		this.subjects[eSize++] = s;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.println(this.subjects[i]);
		}
	}
	
	public void Sort() {
		int in = 0, out;
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
			if(this.subjects[in].code.compareTo(this.subjects[in+1].code) > 0) {
				this.swap(in, in+1);
			}
		}
	}
}		
	
	public void swap(int left,int right) {
		Subject temp = this.subjects[left];
		this.subjects[left] = this.subjects[right];
		this.subjects[right] = temp;
	}
	
	public static void main(String[] args) {
		
	
	Sorting S1 = new Sorting(3);
	Subject S2 = new Subject();
	Subject S3 = new Subject();
	Subject S4 = new Subject();
	
	S2.setCode("[1010]");
	S2.setName("-Physics-");
	S2.setUnit(3);
	S2.setGrad("C");
	
	S3.setCode("[1050]");
	S3.setName("-English-");
	S3.setUnit(2);
	S3.setGrad("B");
	
	S4.setCode("[1020]");
	S4.setName("-Math-");
	S4.setUnit(3);
	S4.setGrad("D");
	
	S1.insert(S2);
	S1.insert(S3);
	S1.insert(S4);
	
	S1.Sort();
	S1.show();
	
	
	}

}