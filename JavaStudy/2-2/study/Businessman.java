package study;

public class Businessman {
	    private String name; //�Ȃ܂�
	    private int gender; //����(1:�j�@2:��)
	    private int length; //�g��
	    private int weight; //�̏d
	    private String skilll; //���Z
	    private String hoby; //�

	    //�R���X�g���N�^
	    public Businessman() {
	      this.name = "�T�����[�}�������Y";
	      this.gender = 1;
	      this.length = 180;
	      this.weight = 80;
	      this.skilll = "���k";
	      this.hoby = "�҂ݕ�";
	    }

	public void sales() {
	  System.out.println(this.name + "�͊O���ɂ����Ă��܂��I");
	}

	public void rest() {
	  System.out.println(this.name + "��" + this.hoby + "�����ċx�e���Ă��܂��B");
	}
	    public String skill() {
		return this.skilll;
	    }
}
