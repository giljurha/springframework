package com.mycompany.springframework.dto;

import lombok.Data;

@Data
public class Ch13Pager {

		private int totalRows;      //페이징 대상이 되는 전체 행수 
		private int totalPageNo;   //전체 페이지 수
		private int totalGroupNo;   //전체 그룹 수 [ 1 2 3 4 5 ]
		private int startPageNo;   //그룹의 시작 페이지 번호 [ 1 ]
		private int endPageNo;      //그룹의 끝 페이지 번호 [ 5 ]
		private int pageNo;         //현재 페이지 번호 [ 3 ]
		private int pagesPerGroup;   //그룹당 페이지 수  5
		private int groupNo;      //현재 그룹 번호 1 그룹의 번호
		private int rowsPerPage;   //페이지당 행 수   1페이지에 몇개의 행을 보이게 할거냐
		private int startRowNo;      //페이지의 시작 행 번호(1, ..., n) 오라클 db에서 1로 보고 mysql에서는 0으로 본다
		private int startRowIndex;   //페이지의 시작 행 인덱스(0, ..., n-1) for mysql totalrows, pagesPerGroup, rowsPerPage, 
		private int endRowNo;      //페이지의 마지막 행 번호
		private int endRowIndex;   //페이지의 마지막 행 인덱스

		public Ch13Pager(int rowsPerPage, int pagesPerGroup, int totalRows, int pageNo) {
			this.rowsPerPage = rowsPerPage;
			this.pagesPerGroup = pagesPerGroup;
			this.totalRows = totalRows;
			this.pageNo = pageNo;

			totalPageNo = totalRows / rowsPerPage;
			if(totalRows % rowsPerPage != 0) totalPageNo++;
	      
			totalGroupNo = totalPageNo / pagesPerGroup;
			if(totalPageNo % pagesPerGroup != 0) totalGroupNo++;
	      
			groupNo = (pageNo - 1) / pagesPerGroup + 1;
	      
			startPageNo = (groupNo-1) * pagesPerGroup + 1;
	      
			endPageNo = startPageNo + pagesPerGroup - 1;
			if(groupNo == totalGroupNo) endPageNo = totalPageNo;
	      
			startRowNo = (pageNo - 1) * rowsPerPage + 1;
			startRowIndex = startRowNo - 1;
			endRowNo = pageNo * rowsPerPage;
			endRowIndex = endRowNo - 1;
			}
}
