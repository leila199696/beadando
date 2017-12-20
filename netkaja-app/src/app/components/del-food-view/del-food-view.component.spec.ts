import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DelFoodViewComponent } from './del-food-view.component';

describe('DelFoodViewComponent', () => {
  let component: DelFoodViewComponent;
  let fixture: ComponentFixture<DelFoodViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DelFoodViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DelFoodViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
