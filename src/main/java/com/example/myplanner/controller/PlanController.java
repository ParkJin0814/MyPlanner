package com.example.myplanner.controller;

import com.example.myplanner.dto.PlanRequestDto;
import com.example.myplanner.dto.PlanResponseDto;
import com.example.myplanner.entity.Plan;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/planner")
public class PlanController {
    private final Map<Long, Plan> planList = new HashMap<>();

    @PostMapping
    public PlanResponseDto createPlan(@RequestBody PlanRequestDto dto) {
        // 식별자가 1씩 증가
        Long planId = planList.isEmpty() ? 1 : Collections.max(planList.keySet()) + 1;

        // 요청받은 데이터로 일정생성
        Plan plan = new Plan(planId, dto.getName(), dto.getPassword(), dto.getTitle(), dto.getContent());

        // inmemory DB에 Plan 저장
        planList.put(planId, plan);

        return new PlanResponseDto(plan);
    }

    //전체조회
    @GetMapping
    public List<Plan> getPlanList(){
        return planList.values().stream()
                .sorted(Comparator.comparing(Plan::getUpdateAt).reversed())
                .collect(Collectors.toList());
    }

    // 일정아이디로 단건조회
    @GetMapping("/{id}")
    public PlanResponseDto findPlanById(@PathVariable Long id){
        Plan plan = planList.get(id);


        return new PlanResponseDto(plan);
    }

    // 파라메터 값으로 조회 수정일 기준으로 내림차순 정렬
    @GetMapping("/request-param")
    public List<Plan> findPlanByParam(
            @RequestParam(required = false) LocalDate updateAt,
            @RequestParam(required = false) String name) {

        return planList.values().stream()
                .filter(p -> (updateAt == null || p.getUpdateAt().toLocalDate().equals(updateAt)) &&
                        (name == null || p.getName().equals(name)))
                .sorted(Comparator.comparing(Plan::getUpdateAt).reversed())
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public PlanResponseDto updatePlanById(
            @PathVariable Long id,
            @RequestBody PlanRequestDto dto
    ) {
        Plan plan = planList.get(id);

        // 비밀번호가 동일할때만 수정
        if(dto.getPassword().equals(plan.getPassword())) {
            plan.update(dto);
        }
        return new PlanResponseDto(plan);
    }

    @DeleteMapping("/{id}")
    public void deletePlan(
            @PathVariable Long id,
            @RequestParam String password
    ) {
        Plan plan = planList.get(id);
        if (plan != null && plan.getPassword().equals(password)) {
            planList.remove(id);
        }
    }

}
