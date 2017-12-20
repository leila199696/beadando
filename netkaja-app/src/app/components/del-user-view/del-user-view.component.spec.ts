import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DelUserViewComponent } from './del-user-view.component';

describe('DelUserViewComponent', () => {
  let component: DelUserViewComponent;
  let fixture: ComponentFixture<DelUserViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DelUserViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DelUserViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
