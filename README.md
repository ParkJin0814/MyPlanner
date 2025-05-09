# MyPlanner


### API 명세서

| 기능           | Method | URL                                            | request  | response | 상태코드 |
|--------------|--------|------------------------------------------------|----------|----------|------|
| 일정생성         | POST   | /api/planner                                   | 요청 body  | 등록정보     |      |
| 일정전체조회       | GET    | /api/planner                                   | 요청 param | 응답정보     |      |
| 일정조회(게시물 번호) | GET    | /api/planner/{id}                              | 요청 param | 응답정보     |      |
| 일정조회(작성자)    | GET    | /api/planner/request-param?name={userId}       | 요청 param | 응답정보     |      |
| 일정조회(수정일)    | GET    | /api/planner/request-param?updateAt={updateAt} | 요청 param | 응답정보     |      |
| 일정수정         | PUT    | /api/planner/{id}                              | 요청 body  | 수정정보     |      |
| 일정삭제         | DELETE | /api/planner/{id}                              | 요청 param | -        |      |


### ERD


