package kr.kh.temp.pagination;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostCriteria extends Criteria {

	private int po_bo_num;

	public PostCriteria(int page, int perPageNum) {
		super(page, perPageNum);
	}
	
	
}