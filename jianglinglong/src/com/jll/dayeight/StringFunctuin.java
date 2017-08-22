package com.jll.dayeight;
import com.jll.dayeight.Countstr;
public class StringFunctuin {
	public int getWordNumber(String findWords) throws Exception{
		if(findWords==null|| findWords.length()==0) {
			Exception e = new Exception("字符串为空");
			throw e;
		}
		String [] strs = findWords.split(" +");
		return strs.length;
	}
	public int getStrsNumber(String src,String findStr) throws Exception{
		if(src==null|| src.length()==0) {
			Exception e = new Exception("字符串为空");
			throw e;
		}	
		return Countstr.count(src, findStr);
	}
	public boolean contain(String src, String contatinsStr) throws Exception{
		if(src==null|| src.length()==0) {
			Exception e = new Exception("字符串为空");
			throw e;
		}	
		return src.contains(contatinsStr);
	}
}
